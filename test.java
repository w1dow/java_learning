/**
 * ou are given a string s. Simulate events at each second i:
 * 
 * If s[i] == 'E', a person enters the waiting room and takes one of the chairs
 * in it.
 * If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
 * Return the minimum number of chairs needed so that a chair is available for
 * every person who enters the waiting room given that it is initially empty.
 * 
 * 
 */
public class test {

    // count the maximum no. of people at any instance in the room
    static int minchair(String s) {
        int c =0; // count of total number of people currently in the room
        int max = 0; //count of maximum number of people in the room so far.
        for (char x : s.toCharArray()) {
            if (x == 'E')
                c++;
            else
                c--;
            max = (max > c) ? max : c;  
        }

        return max;
    }



    public static void main(String[] args) {
        System.err.println(minchair("ELEELEELLL"));
    }
}