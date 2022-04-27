package UltimateBordFodboldTurnering;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //Tournament.runTournament();

        Connection c = null;
        DBinfo d = new DBinfo();
        DatabaseIO w = new DatabaseIO();

        try
        {
            c = DriverManager.getConnection(d.getJdbcUrl(), d.getUsername(), d.getPassword());
            w.getTeamNames(c);
            w.getTeamPlayers(c);
            w.findPlayerPartialInput(c);
            w.findTeamPartialInput(c);
            //w.addPlayer(c);
            //w.deletePlayer(c);
            //w.addExistingPlayerToTeam(c);
            //w.addPoints(c);
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

