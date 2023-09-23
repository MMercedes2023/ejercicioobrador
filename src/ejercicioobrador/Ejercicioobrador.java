package ejercicioobrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Ejercicioobrador {

     public static void main(String[] args) {
        // TODO code application logic here
        //cargar drivers
        try {
            //Cargar Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Conexion a la Base de Datos
            Connection conexion=DriverManager.getConnection("jdbc:mariadb://localhost:3306/ejercicioobrador", "root", null);
            //Agregar empleado
          /*String sql="  INSERT INTO empleado( dni, apellido, nombre, acceso, estado) "
                  + "VALUES(23456789,'Molinari','Maria',1,true)";
                  PreparedStatement ps=conexion.prepareStatement(sql);
            
                  int registro=ps.executeUpdate();
                   System.out.println(registro);*/
                   //Actualizar un empleado
                  /* String sql="UPDATE empleado Set nombre='Roxana'WHERE dni=23456789";
                   PreparedStatement ps=conexion.prepareStatement(sql);
                   int registro=ps.executeUpdate();
                   System.out.println(registro);*/
                   //Actualizar un empleado
                   
                   //Elñiminar un registro
                      /*String sql="DELETE FROM empleado WHERE dni=23456789";
                   PreparedStatement ps=conexion.prepareStatement(sql);
                   int registro=ps.executeUpdate();
                   System.out.println(registro); */ 
                    String sql="SELECT*FROM empleado";
                    PreparedStatement ps=conexion.prepareStatement(sql);
                    ps.executeQuery();
                    ResultSet resultado=ps.executeQuery();
                    while (resultado.next()){
                        System.out.println("ID: "+resultado.getInt("Id_empleado"));
                        System.out.println("Apellido: "+resultado.getString("apellido"));
                        System.out.println("Nombre:"+resultado.getString("nombre"));
                        System.out.println("DNI: "+resultado.getInt("dni"));
                        System.out.println("Acceso: "+resultado.getInt("acceso"));
                        System.out.println("Estado: "+resultado.getBoolean("estado"));
                        System.out.println("*****************************************");
                        
                            }
                          
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver"+ex.getMessage());
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al cargar base de datos"+ex.getMessage());
         }
    }
    }
    

    


