
/**
 * Mastery Test Week 3 Exercise 3. Thread 2.
 * - Reverse SEVEN elements in an array.
 * 
 * @author (your name) 
 */
public class Exercise3
{
    public static double[] reverse(double[] elements)
    {
        double temp;
        
        // In the coming weeks, the lecturer will explain all of the code above. But for now here is an explanation:
        // 1. In the code above we have provided a double array "elements", containing SEVEN elements.
        // 2. In the code above we have also provided another double variable called "temp".
        // In the space provided below, write code to reverse the order of elements in the array "elements".
        // 
        // Do NOT initialise "elements[0]" ... "elements[6]". Just write the lines that swap the values.
        // Add your code BELOW this line. Do NOT change anything ABOVE this comment line.
        
        for(int i = 0; i < elements.length / 2; i++)
        {
            int j = elements.length-1 -i;
            temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
        }
        
        
        // Add your code ABOVE this line. Do NOT change anything BELOW this comment line.
        return elements;
    }
}
