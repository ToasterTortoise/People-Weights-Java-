import java.util.Scanner;

/**
 * Handles an array of peoples weights.
 */
public class PeopleWeights
{
    // static variables that we can access in our static methods.
    static final int WEIGHT_ARRAY_SIZE = 5;
    static double[] weightsOfPeople = new double[WEIGHT_ARRAY_SIZE];
    static double weightElement;
    static double sum = 0.0;
    static Scanner scnr = new Scanner(System.in);


    public static void main(String[] args)
    {
        GetWeights();
        WeightsSum();
        WeightsAverage();
        WeightsMax();
        return;
    }

    /**
     * Takes input for the weights and store them inside our array.
     */
    public static void GetWeights()
    {
        int i = 0; // Local count variable.

        // Take input for the weights and store them in our array.
        for(i = 0; i < WEIGHT_ARRAY_SIZE; i++)
        {
            System.out.println("Enter weight " + (i + 1) + ":");
            weightElement = scnr.nextDouble();
            weightsOfPeople[i] = weightElement;
        }

        // Display what the user entered
        System.out.print("You entered: ");
        for(i = 0; i < WEIGHT_ARRAY_SIZE; i++)
        {
            System.out.print(weightsOfPeople[i] + " ");
        }

        return;
    }

    /**
     * Gets the sum of our weights and then displays that sum.
     */
    static void WeightsSum()
    {
        int i = 0;

        for(i = 0; i < WEIGHT_ARRAY_SIZE; i++)
        {
            sum += weightsOfPeople[i];
        }

        System.out.println("\n\nTotal weight: " + sum);

        return;
    }

    /**
     * Gets the average of our weights and then displays that average.
     */
    static void WeightsAverage()
    {
        double averageWeight = 0.0;

        // Convert WEIGHT_ARRAY_SIZE to a double for good calculation.
        averageWeight = sum / (double)WEIGHT_ARRAY_SIZE;

        System.out.println("Average weight: " + averageWeight);

        return;
    }

    /**
     * Gets the max of our weights and then displays that max.
     */
    static void WeightsMax()
    {
        int i= 0;
        double maxWeight = 0.0;

        for(i = 0; i < WEIGHT_ARRAY_SIZE; i++)
        {
            if(weightsOfPeople[i] > maxWeight)
            {
                maxWeight = weightsOfPeople[i];
            }
        }

        System.out.println("Max weight: " + maxWeight);

        return;
    }
}
