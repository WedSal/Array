// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 6, 9 };
        String[] allnames = {"David", "Susan", "Lois", "Laura"};
        String [] moreNames = new String[25];


        String name1 = allnames[1];
        System.out.println(name1);

        for (int i = 0; i < allnames.length; i++) {
            System.out.println(allnames[i]);
        }

        for (String anotherName : allnames) {
            System.out.println(name);
        }

    }

    static boolean contains( String name, String [] namesArray) {
        for(String str : namesArray){
            if (str.equals(name)) {
                return true;
                
            }
        }
    }


}