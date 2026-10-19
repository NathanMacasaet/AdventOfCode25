import java.util.*;

public class Day1{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
            int num = 50;
            int count = 0;

        while (in.hasNextLine()) {
        String word = in.nextLine().trim();

        if (word.isEmpty()) {
            continue;
        }

        char direction = word.charAt(0);
        int movement = Integer.parseInt(word.substring(1));

        if (direction == 'L') {
            num -= movement;
        } else if (direction == 'R') {
            num += movement;
        }

        num = Math.floorMod(num, 100);

        if (num == 0) {
            count++;
        }
    }
    in.close();
    System.out.println("Password: " + count);
    }
        
}