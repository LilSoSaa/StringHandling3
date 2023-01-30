public class Main {
    public static void main(String[] args) {


        String[] array1 = {" I want " , " to learn " , " how to code! "};
        String[] array2 = new String[array1.length];

        for (int i=0 ; i < array1.length; i++){
            array2[i] = array1[i].trim();
        }

        boolean statement1 = array2[0].equals("I want");
        boolean statement2 = array2[1].equalsIgnoreCase("To learn");

        System.out.println(!(statement1 && statement2));

    }
}