
package ReglasDeNegocio;

import AccesoADatos.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
public class Ordenes {
    
    private int ordenid;
    private int proveedorid;
    private int productoid;
    private int cantidad;
    private double  preciounitario;
    private String numeroorden ;
    private boolean entregada;
    private Date fechaentrega ;

    public Ordenes() {
    }

    public Ordenes(int ordenid, int proveedorid, int productoid, int cantidad, double preciounitario, String numeroorden, boolean entregada, Date fechaentrega) {
        this.ordenid = ordenid;
        this.proveedorid = proveedorid;
        this.productoid = productoid;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.numeroorden = numeroorden;
        this.entregada = entregada;
        this.fechaentrega = fechaentrega;
    }

    public int getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(int ordenid) {
        this.ordenid = ordenid;
    }

    public int getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(int proveedorid) {
        this.proveedorid = proveedorid;
    }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getNumeroorden() {
        return numeroorden;
    }

    public void setNumeroorden(String numeroorden) {
        this.numeroorden = numeroorden;
    }

    public boolean getEntregada() {
        return entregada;
    }

    public void setEntregada(boolean entregada) {
        this.entregada = entregada;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

 
    
 
    


    public static ArrayList<Ordenes> ordenes_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Ordenes> lista= new ArrayList<Ordenes>();
          Ordenes obj= new Ordenes();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;

      try {
          //declaro mi sql
          String sql= "  select * from ordenes_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Ordenes();
              obj.setOrdenid(rs.getInt("pordenid"));
              obj.setProveedorid(rs.getInt("pclienteid"));
              obj.setProductoid(rs.getInt("pproductoid"));
              obj.setCantidad(rs.getInt("pcantidadid"));
              obj.setPreciounitario(rs.getDouble("ppreciounitario"));
              obj.setNumeroorden(rs.getString("pnumeroorden"));
              obj.setEntregada(rs.getBoolean("pentregada"));
              obj.setFechaentrega(rs.getDate("pfechaentrega"));
             
         
              lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return lista;

    }

   public static ArrayList<Ordenes> orden_buscarporid(int piordenid) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Ordenes> lista= new ArrayList<Ordenes>();
          Ordenes obj= new Ordenes();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      
      
      try {
          //declaro mi sql
          String sql= "select * from orden_buscarporid(?,?,?,?,?,?,?,?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piordenid);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Ordenes();
              obj.setOrdenid(rs.getInt("pordenid"));
              obj.setProveedorid(rs.getInt("pclienteid"));
              obj.setProductoid(rs.getInt("pproductoid"));
              obj.setCantidad(rs.getInt("pcantidadid"));
              obj.setPreciounitario(rs.getDouble("ppreciounitario"));
              obj.setNumeroorden(rs.getString("pnumeroorden"));
              obj.setEntregada(rs.getBoolean("pentregada"));
              obj.setFechaentrega(rs.getDate("pfechaentrega"));
               
         
              lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return lista;

    } 
   public static boolean orden_insertar(Ordenes ordenes) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql(" select *from orden_insertar(?,?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          
                
          parametros.add(new Parametro(1, ordenes.getOrdenid()));
          parametros.add(new Parametro(2, ordenes.getProveedorid()));
          parametros.add(new Parametro(3, ordenes.getProductoid()));
          parametros.add(new Parametro(4, ordenes.getCantidad()));
          parametros.add(new Parametro(5, ordenes.getPreciounitario()));
          parametros.add(new Parametro(6, ordenes.getNumeroorden()));
          parametros.add(new Parametro(7, ordenes.getEntregada()));
          parametros.add(new Parametro(8, ordenes.getFechaentrega()));
          
          
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
      finally
      {
          con.desconectar();
      }
      return respuesta;

  }
       public static boolean orden_eliminar(int pscactbevidenid) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from orden_eliminar(?,?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, pscactbevidenid));
          
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
            finally
      {
          con.desconectar();
      }
      return respuesta;

  }
public static boolean orden_editar(Ordenes ordenes) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select *from orden_editar(?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros

         
          parametros.add(new Parametro(1, ordenes.getOrdenid()));
          parametros.add(new Parametro(2, ordenes.getProveedorid()));
          parametros.add(new Parametro(3, ordenes.getProductoid()));
          parametros.add(new Parametro(4, ordenes.getCantidad()));
          parametros.add(new Parametro(5, ordenes.getPreciounitario()));
          parametros.add(new Parametro(6, ordenes.getNumeroorden()));
          parametros.add(new Parametro(7, ordenes.getEntregada()));
          parametros.add(new Parametro(8, ordenes.getFechaentrega()));
          
         
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
      finally
      {
          con.desconectar();
      }
      return respuesta;

  }
    
}
