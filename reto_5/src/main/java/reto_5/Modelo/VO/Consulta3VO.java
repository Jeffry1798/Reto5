package reto_5.Modelo.VO;
import java.sql.*;
import java.util.ArrayList;
import reto_5.Modelo.DAO.*;

public class Consulta3VO {

    public static ArrayList<String[]>  valores() {
      
        ArrayList<String[]> salida_vo =  new ArrayList<String[]>();

        try {
            ResultSet rs=Consulta3DAO.consulta(); 
            while(rs.next()){
                int ID =rs.getInt("ID_Compra");
                String constructora=rs.getString("Constructora");
                String bv=rs.getString("Banco_Vinculado");
                salida_vo.add(new String[] {ID+"",constructora,bv});  
            }
        } catch (Exception e) {
            
        }
        return salida_vo;
    }
}
