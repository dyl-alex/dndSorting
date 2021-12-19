import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dnd {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner kbReader = new Scanner(System.in);

        ArrayList<characters> characterList = new ArrayList<characters>();

        setCharacters(characterList);
        
        System.out.println("Hello! Welcome to DND. How would you like to sort your characters?");
        System.out.println("You can sort by Strength, Wisdom, Dexterity, Constitution, Charisma, and Intelligence");
        String input = kbReader.nextLine();
        sortCharacters(characterList, input.toLowerCase());
        while(true) {
            setCharacters(characterList);
            System.out.println("Would you like to sort something else?");
            System.out.println("Yes or No");
            input = kbReader.nextLine().toLowerCase();
            
            if (input.equals("yes")) {
                System.out.println("You can sort by Strength, Wisdom, Dexterity, Constitution, Charisma, and Intelligence");
                input = kbReader.nextLine();
                sortCharacters(characterList, input.toLowerCase());
            } else if (input.equals("no")) {
                break;
            } else if (input.equals("recursion!")) {
                System.out.println("I was stuck on morseCode for almost 2 months");
                break;
            } else {
                break;
            }
        }
    }

    public static void setCharacters(ArrayList<characters> characterList) throws FileNotFoundException {
        File cList = new File("C:\\Users\\dyale\\OneDrive\\Desktop\\School\\dndSorting\\characters.txt");
        Scanner cReader = new Scanner(cList);

        while(cReader.hasNextLine()) {
            String line = cReader.nextLine();
            if (line.contains("-")) {
                line.replace(" ", "");
                characters t = new characters(line.substring(0, line.indexOf("-")), line.substring(line.indexOf("-") + 2, line.length()));
                for(int i = 0; i < 6; i++) {
                    line = cReader.nextLine();
                    line.replace(" ", "");
                    int x = line.indexOf(":");
                    String path = line.substring(0, x);

                    if (path.toLowerCase().equals("wisdom")) {
                        t.wisdom = Integer.parseInt(line.substring(x+1));
                    } else if (path.toLowerCase().equals("strength")) {
                        t.strength = Integer.parseInt(line.substring(x+1));
                    } else if (path.toLowerCase().equals("dexterity")) {
                        t.dexterity = Integer.parseInt(line.substring(x+1));
                    } else if (path.toLowerCase().equals("charisma")) {
                        t.charisma = Integer.parseInt(line.substring(x+1));
                    } else if (path.toLowerCase().equals("constitution")) {
                        t.constitution = Integer.parseInt(line.substring(x+1));
                    } else if (path.toLowerCase().equals("intelligence")) {
                        t.intelligence = Integer.parseInt(line.substring(x+1));
                    } else {
                        continue;
                    }
            }
            characterList.add(t);
        } else {
            continue;
        }
    }

        cReader.close();
    }

    public static void sortCharacters(ArrayList<characters> characterList, String stat) {
        ArrayList<characters> dupe = characterList;
        int itt = 0;
        if (stat.equals("wisdom")) {

            while(!dupe.isEmpty()) {
                int x = dupe.get(0).wisdom;
                itt = 0;
                for(int i = 0; i < dupe.size(); i++) {
                    if (x < dupe.get(i).wisdom) {
                        x = dupe.get(i).wisdom;
                        itt = i;
                    }
                }
                System.out.println(dupe.get(itt).name + ": " + dupe.get(itt).wisdom);
                dupe.remove(itt);
            }

        } else if (stat.equals("strength")) {

            while(!dupe.isEmpty()) {
                int x = dupe.get(0).strength;
                itt = 0;
                for(int i = 0; i < dupe.size(); i++) {
                    if (x < dupe.get(i).strength) {
                        x = dupe.get(i).strength;
                        itt = i;
                    }
                }
                System.out.println(dupe.get(itt).name + ": " + dupe.get(itt).strength);
                dupe.remove(itt);
            }

        } else if (stat.equals("dexterity")) {

            while(!dupe.isEmpty()) {
                int x = dupe.get(0).dexterity;
                itt = 0;
                for(int i = 0; i < dupe.size(); i++) {
                    if (x < dupe.get(i).dexterity) {
                        x = dupe.get(i).dexterity;
                        itt = i;
                    }
                }
                System.out.println(dupe.get(itt).name + ": " + dupe.get(itt).dexterity);
                dupe.remove(itt);
            }

        } else if (stat.equals("constitution")) {

            while(!dupe.isEmpty()) {
                int x = dupe.get(0).constitution;
                itt = 0;
                for(int i = 0; i < dupe.size(); i++) {
                    if (x < dupe.get(i).constitution) {
                        x = dupe.get(i).constitution;
                        itt = i;
                    }
                }
                System.out.println(dupe.get(itt).name + ": " + dupe.get(itt).constitution);
                dupe.remove(itt);
            }

        } else if (stat.equals("charisma")) {

            while(!dupe.isEmpty()) {
                int x = dupe.get(0).charisma;
                itt = 0;
                for(int i = 0; i < dupe.size(); i++) {
                    if (x < dupe.get(i).charisma) {
                        x = dupe.get(i).charisma;
                        itt = i;
                    }
                }
                System.out.println(dupe.get(itt).name + ": " + dupe.get(itt).charisma);
                dupe.remove(itt);
            }

        } else if (stat.equals("intelligence")) {

            while(!dupe.isEmpty()) {
                int x = dupe.get(0).intelligence;
                itt = 0;
                for(int i = 0; i < dupe.size(); i++) {
                    if (x < dupe.get(i).intelligence) {
                        x = dupe.get(i).intelligence;
                        itt = i;
                    }
                }
                System.out.println(dupe.get(itt).name + ": " + dupe.get(itt).intelligence);
                dupe.remove(itt);
            }

        } else {
            System.out.println("not sure what you mean by that");
        }
    }
    
}
