package aulas.excecoes;

public class Exemplo5 {
    public static void main(String[] args) {
        Data niver = new Data();
          
        try{
            niver.setDia(4);
            niver.setMes(4);
            niver.setAno(2025);
        }catch(RuntimeException ex1){
            System.out.println(ex1.getMessage());
        }catch (Exception ex2){
            System.out.println(ex2.getMessage());
        }
    }
}
