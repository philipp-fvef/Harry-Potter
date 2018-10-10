import java.util.Scanner;

class Testing {
    public static void main(String[ ] args) {

        Scanner myVar = new Scanner(System.in);
        int Input = myVar.nextInt();

        String[] Books = {"Harry Potter Heptology by Joanne K. Rowling:","",
                        "Harry Potter and the Pilosopher's Stone",
                        "Harry Potter and the Chamber of Secrets",
                        "Harry Potter and the Prisoner of Azkaban",
                        "Harry Potter and the Goblet of Fire",
                        "Harry Potter and the Order of the Phoenix",
                        "Harry Potter and the Half-Blood Prince",
                        "Harry Potter and the Deathly Hallows"};

        if(Input == 0) {
            for(int x=0; x<Books.length; x++) {
                System.out.println(Books[x]);
            }
        }

        else {
            System.out.println("Book "+Input+": "+Books[Input]);
        }

    }
}
