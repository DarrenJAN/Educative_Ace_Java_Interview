package Array;

public class Next_Letter {
    public static char searchNextLetter(char[] letters, char key) {
        // TODO: Write your code here
        int l = 0;
        int r = letters.length - 1;
        if(key > letters[r])
            return letters[l];
        else if(key < letters[l])
            return letters[l];
        while(l <= r)
        {
            int mid = (r - l) /2 + l;
            if(letters[mid] == key)
                return letters[mid];
            else if(letters[mid] < key)
            {
                l = mid +1;
            }else
            {
                r = mid -1;
            }
        }
        return letters[l];
    }

}
