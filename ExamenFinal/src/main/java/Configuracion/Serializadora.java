/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;


/**
 *
 * @author USER
 */
public class Serializadora {
    /*
    public static void serializar(String sNombreArchivo, InventarioObras arreglo){//es necesario meterlo en un try catch
        try{
             boolean exists = new File(sNombreArchivo).exists();
        FileOutputStream fos = new FileOutputStream(sNombreArchivo, true);
        ObjectOutputStream oos = exists ? 
            new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            }:new ObjectOutputStream(fos);
            
            oos.writeObject(arreglo);
            
            oos.close();
            
            System.out.println("Se creo");
        }
        catch(IOException e){//Excepcion
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<InventarioObras> deserializar (String sNombreArchivo){//LEER
        ArrayList<InventarioObras> temporal_obra = new ArrayList<InventarioObras>();
        try{
        FileInputStream fis = new FileInputStream(sNombreArchivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while(fis.available() > 0) {
                InventarioObras rper =(InventarioObras) ois.readObject();
                temporal_obra.add(rper);
        }
        ois.close();
                      
        }
        catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
            }
        catch(IOException e){
            throw new RuntimeException(e);
        }
        finally{
             return temporal_obra;  
        }
    
        
       }  
       
    public static void limpiarArchivo(String sNombreArchivo){    
           File file = new File(sNombreArchivo);
           if (file.delete()) {
            System.out.println("file deleted");
            }
       }
*/
}
