import java.io.*;

public class Main{

    public static void main(String[] args){

        // take inputted files
        // seperate text files via comma
        // create different objects regarding each supplier
        // create an outputted file
        String file = "C:\\Users\\16479\\Desktop\\cp317project\\ProductFile.txt";
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){

                String[] row = line . split(",");
                for(String index : row){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        String file2 = "C:\\Users\\16479\\Desktop\\cp317project\\SupplierFile.txt";
        BufferedReader reader2 = null;
        String line2 = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){

                String[] row = line . split(",");
                for(String index : row){
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                reader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}

