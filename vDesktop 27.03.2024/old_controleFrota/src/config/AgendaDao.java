package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Priscila
 */
public class AgendaDao {

    //Criando a conexão com o banco
    Conectar con = new Conectar();
    PreparedStatement st;

    public AgendaDao() {

    }

    public int incluirAgenda(List<Agenda> agendas) {
        Connection cn = con.conexao();

        int status = 0;
        try {

            st = cn.prepareStatement("INSERT INTO agenda(data, horario, status, box) VALUES(?,?,?,?)");

            for (Agenda entrada : agendas) {
                st.setDate(1, java.sql.Date.valueOf(entrada.getData()));
                st.setString(2, entrada.getHorario());
                st.setString(3, entrada.getStatus());
                st.setInt(4, entrada.getBox());

                status = st.executeUpdate();
            }
            con.desconectar(cn);
            return status;
        } catch (SQLException ex) {
            System.err.println("Erro ao gravar agenda no banco de dados: " + ex.getMessage());
            return ex.getErrorCode();
        }

    }

    public int NoEqualsData(LocalDate data) {
        Connection cn = con.conexao();
        int value = 0;
        try {
            st = cn.prepareStatement("SELECT * FROM agenda WHERE data = ?");
            st.setDate(1, java.sql.Date.valueOf(data));

            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                value = 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        con.desconectar(cn);
        return value;
    }

    public boolean alterar(Agenda agenda) {
        Connection cn = con.conexao();
        try {

            st = cn.prepareStatement("UPDATE agenda SET status = ? WHERE data = ?");

            st.setString(1, "cancelado");
            st.setDate(2, java.sql.Date.valueOf(agenda.getData()));

            int status = st.executeUpdate();
            con.desconectar(cn);
            return status > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            con.desconectar(cn);
            return false;
        }
    }

    public List<Agenda> consultarPorAgenda(LocalDate dataAtual) {
        Connection cn = con.conexao();
        List<Agenda> agendaEncontrada = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT * FROM agenda WHERE data = ?");
            st.setDate(1, java.sql.Date.valueOf(dataAtual));

            rs = st.executeQuery();
            while (rs.next()) {
                Agenda agenda = new Agenda();
                agenda.setData(dataAtual);
                agenda.setHorario(rs.getString("horario"));
                agenda.setStatus(rs.getString("status"));
                agenda.setBox(rs.getInt("box"));

                agendaEncontrada.add(agenda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        con.desconectar(cn);
        return agendaEncontrada;
    }

    public List<Agenda> consultarPorHorarioBox(LocalDate data) {
        Connection cn = con.conexao();
        List<Agenda> agendaEncontrada = new ArrayList<>();

        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT * FROM agenda WHERE data = ? AND status = ?");
            st.setDate(1, java.sql.Date.valueOf(data));
            st.setString(2, "disponivel");

            rs = st.executeQuery();
            while (rs.next()) {
                Agenda agenda = new Agenda();
                agenda.setHorario(rs.getString("horario"));
                agenda.setBox(rs.getInt("box"));

                agendaEncontrada.add(agenda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        con.desconectar(cn);
        return agendaEncontrada;
    }

    public int noEqualsDiaHorarioDisponivel(LocalDate data, String horario, int box) {
        Connection cn = con.conexao();
        int value = 0;
        ResultSet rs = null;
        try {
            st = cn.prepareStatement("SELECT * FROM agenda WHERE data = ? AND horario = ? AND status = ? AND box = ?");
            st.setDate(1, java.sql.Date.valueOf(data));
            st.setString(2, horario);
            st.setString(3, "disponivel");
            st.setInt(4, box);

            rs = st.executeQuery();
            if (rs.first()) {
                value = 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        con.desconectar(cn);
        return value;
    }

    public boolean agendarVeiculoCorretivaPreventiva(Agenda agenda) {
        Connection cn = con.conexao();
        try {

            st = cn.prepareStatement("UPDATE agenda SET placa = ?, status = ?, OSPreventiva = ?,OSCorretiva = ? WHERE data = ? AND horario = ? AND status = ?"
                    + " AND box = ?");
            st.setString(1, agenda.getPlaca());
            st.setString(2, "agendado");
            st.setInt(3, agenda.getOsPreventiva());
            st.setInt(4, agenda.getOsCorretiva());
            st.setDate(5, java.sql.Date.valueOf(agenda.getData()));
            st.setString(6, agenda.getHorario());
            st.setString(7, "disponivel");
            st.setInt(8, agenda.getBox());

            int status = st.executeUpdate();
            con.desconectar(cn);
            return status > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            con.desconectar(cn);
            return false;
        }
    }

    public boolean agendarVeiculoPreventiva(Agenda agenda) {
        Connection cn = con.conexao();

        try {

            st = cn.prepareStatement("UPDATE agenda SET placa = ?, status = ?, OSPreventiva = ? WHERE data = ? AND horario = ? AND status = ?"
                    + " AND box = ?");
            st.setString(1, agenda.getPlaca());
            st.setString(2, "agendado");
            st.setInt(3, agenda.getOsPreventiva());
            st.setDate(4, java.sql.Date.valueOf(agenda.getData()));
            st.setString(5, agenda.getHorario());
            st.setString(6, "disponivel");
            st.setInt(7, agenda.getBox());

            int status = st.executeUpdate();
            con.desconectar(cn);
            return status > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            con.desconectar(cn);
            return false;
        }
    }

    public boolean agendarVeiculoCorretiva(Agenda agenda) {
        Connection cn = con.conexao();
        try {

            st = cn.prepareStatement("UPDATE agenda SET placa = ?, status = ?, OSCorretiva = ? WHERE data = ? AND horario = ? AND status = ?"
                    + " AND box = ?");
            st.setString(1, agenda.getPlaca());
            st.setString(2, "agendado");
            st.setInt(3, agenda.getOsCorretiva());
            st.setDate(4, java.sql.Date.valueOf(agenda.getData()));
            st.setString(5, agenda.getHorario());
            st.setString(6, "disponivel");
            st.setInt(7, agenda.getBox());

            int status = st.executeUpdate();
            con.desconectar(cn);
            return status > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            con.desconectar(cn);
            return false;
        }
    }

    public int noEqualsAgendado(LocalDate data, String horario, String placa, int box) {
        Connection cn = con.conexao();
        int value = 0;
        ResultSet rs = null;
        try {
            PreparedStatement st = cn.prepareStatement("SELECT * FROM agenda WHERE data = ? AND horario = ? AND status = ? AND box = ? AND placa = ?");
            st.setDate(1, java.sql.Date.valueOf(data));
            st.setString(2, horario);
            st.setString(3, "agendado");
            st.setInt(4, box);
            st.setString(5, placa);

            rs = st.executeQuery();
            if (rs.first()) {
                value = 1;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }
        con.desconectar(cn);
        return value;
    }

    public boolean CancelarVeiculo(Agenda agenda) {
        Connection cn = con.conexao();
        try {

            PreparedStatement st = cn.prepareStatement("UPDATE agenda SET status = ?, placa = ?, OSPreventiva = ?, OSCorretiva = ?"
                    + " WHERE data = ? "
                    + "AND horario = ? AND status = ? AND box = ? AND placa = ?");

            st.setString(1, "disponivel");
            st.setString(2, null);
            st.setInt(3, 0);
            st.setInt(4, 0);
            st.setDate(5, java.sql.Date.valueOf(agenda.getData()));
            st.setString(6, agenda.getHorario());
            st.setString(7, "agendado");
            st.setInt(8, agenda.getBox());
            st.setString(9, agenda.getPlaca());

            int status = st.executeUpdate();
            con.desconectar(cn);
            return status > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            con.desconectar(cn);
            return false;
        }
    }

    public List<Agenda> consultarPorAgendamentoPlaca(String placa) {
        Connection cn = con.conexao();
        List<Agenda> agendaEncontrada = new ArrayList<>();
        ResultSet rs = null;
        try {
            PreparedStatement st = cn.prepareStatement("SELECT * FROM agenda WHERE placa = ? AND status = ?");
            st.setString(1, placa);
            st.setString(2, "agendado");

            rs = st.executeQuery();

            while (rs.next()) {
                Agenda agenda = new Agenda();
                if (rs.getInt("OSPreventiva") != 0) {
                    agenda.setOsPreventiva(rs.getInt("OSPreventiva"));
                }
                if (rs.getInt("OSCorretiva") != 0) {
                    agenda.setOsCorretiva(rs.getInt("OSCorretiva"));
                }
                agenda.setData(rs.getDate("data").toLocalDate());
                agenda.setHorario(rs.getString("horario"));
                agenda.setBox(rs.getInt("box"));

                agendaEncontrada.add(agenda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        con.desconectar(cn);
        return agendaEncontrada;
    }
}
