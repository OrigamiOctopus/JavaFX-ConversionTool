/*
 * @authors Amanda Tustin
 *
 */

package MidtermCIT230;

public class Conversions 
{
    //variables
 
    //teaspoon
    private static final double TEA_TO_TABLE = .333333;
    private static final double TEA_TO_OUNCE = .166667;
    private static final double TEA_TO_CUP = .0205372;
    private static final double TEA_TO_PINT = .0104167;
    private static final double TEA_TO_QUART = .00520833;
    private static final double TEA_TO_GAL = .00130208;
    //tablespoon
    private static final double TABLE_TO_TEA = 3;
    private static final double TABLE_TO_OUNCE = .5;
    private static final double TABLE_TO_CUP = .0625;
    private static final double TABLE_TO_PINT = .03125;
    private static final double TABLE_TO_QUART = .015625;
    private static final double TABLE_TO_GAL = .00390625;
    //ounce
    private static final double OUNCE_TO_TEA = 6;
    private static final double OUNCE_TO_TABLE = 2;
    private static final double OUNCE_TO_CUP = .125;
    private static final double OUNCE_TO_PINT = .0625;
    private static final double OUNCE_TO_QUART = .03125;
    private static final double OUNCE_TO_GAL = .0078125;
    //cup
    private static final double CUP_TO_TEA = 48;
    private static final double CUP_TO_TABLE = 16;
    private static final double CUP_TO_OUNCE = 8;
    private static final double CUP_TO_PINT = .5;
    private static final double CUP_TO_QUART = .25;
    private static final double CUP_TO_GAL = .0634013;
    //pint
    private static final double PINT_TO_TEA = 96;
    private static final double PINT_TO_TABLE = 32;
    private static final double PINT_TO_CUP = 16;
    private static final double PINT_TO_OUNCE = 2;
    private static final double PINT_TO_QUART = .5;
    private static final double PINT_TO_GAL = .125;  
    //quart
    private static final double QUART_TO_TEA = 192;
    private static final double QUART_TO_TABLE = 64;
    private static final double QUART_TO_CUP = 32;
    private static final double QUART_TO_OUNCE = 4;
    private static final double QUART_TO_PINT = 2;
    private static final double QUART_TO_GAL = .25;
    //gallon
    private static final double GAL_TO_TEA = 768;
    private static final double GAL_TO_TABLE = 256;
    private static final double GAL_TO_CUP = 15.7725;
    private static final double GAL_TO_OUNCE = 128;
    private static final double GAL_TO_PINT = 8;
    private static final double GAL_TO_QUART = 4;
    
    //teaspoon conversion methods
    static double teaToTable(double from)
    {
        double to;
        to = from * TEA_TO_TABLE;
        return to;
    }   
    static double teaToOunce(double from)
    {
        double to;
        to = from * TEA_TO_OUNCE;
        return to;
    } 
    static double teaToCup(double from)
    {
        double to;
        to = from * TEA_TO_CUP;
        return to;
    }
    static double teaToPint(double from)
    {
        double to;
        to = from * TEA_TO_PINT;
        return to;
    }
    static double teaToQuart(double from)
    {
        double to;
        to = from * TEA_TO_QUART;
        return to;
    }
    static double teaToGallon(double from)
    {
        double to;
        to = from * TEA_TO_GAL;
        return to;
    }
    
    //tablespoon conversion methods
    static double tableToTea(double from)
    {
        double to;
        to = from * TABLE_TO_TEA;
        return to;
    }
    static double tableToOunce(double from)
    {
        double to;
        to = from * TABLE_TO_OUNCE;
        return to;
    }
    static double tableToCup(double from)
    {
        double to;
        to = from * TABLE_TO_CUP;
        return to;
    }
    static double tableToPint(double from)
    {
        double to;
        to = from * TABLE_TO_PINT;
        return to;
    }
    static double tableToQuart(double from)
    {
        double to;
        to = from * TABLE_TO_QUART;
        return to;
    }
    static double tableToGallon(double from)
    {
        double to;
        to = from * TABLE_TO_GAL;
        return to;
    }
    
    //ounce conversion methods
    static double ounceToTea(double from)
    {
        double to;
        to = from * OUNCE_TO_TEA;
        return to;
    }
    static double ounceToTable(double from)
    {
        double to;
        to = from * OUNCE_TO_TABLE;
        return to;
    }
    static double ounceToCup(double from)
    {
        double to;
        to = from * OUNCE_TO_CUP;
        return to;
    }
    static double ounceToPint(double from)
    {
        double to;
        to = from * OUNCE_TO_PINT;
        return to;
    }
    static double ounceToQuart(double from)
    {
        double to;
        to = from * OUNCE_TO_QUART;
        return to;
    }
    static double ounceToGallon(double from)
    {
        double to;
        to = from * OUNCE_TO_GAL;
        return to;
    }
    
    //cup conversion methods
    static double cupToTea(double from)
    {
        double to;
        to = from * CUP_TO_TEA;
        return to;
    }
    static double cupToTable(double from)
    {
        double to;
        to = from * CUP_TO_TABLE;
        return to;
    }
    static double cupToOunce(double from)
    {
        double to;
        to = from * CUP_TO_OUNCE;
        return to;
    }
    static double cupToPint(double from)
    {
        double to;
        to = from * CUP_TO_PINT;
        return to;
    }
    static double cupToQuart(double from)
    {
        double to;
        to = from * CUP_TO_QUART;
        return to;
    }
    static double cupToGallon(double from)
    {
        double to;
        to = from * CUP_TO_GAL;
        return to;
    }
    
    //pint conversion methods
    static double pintToTea(double from)
    {
        double to;
        to = from * PINT_TO_TEA;
        return to;
    }
    static double pintToTable(double from)
    {
        double to;
        to = from * PINT_TO_TABLE;
        return to;
    }
    static double pintToCup(double from)
    {
        double to;
        to = from * PINT_TO_CUP;
        return to;
    }
    static double pintToOunce(double from)
    {
        double to;
        to = from * PINT_TO_OUNCE;
        return to;
    }
    static double pintToQuart(double from)
    {
        double to;
        to = from * PINT_TO_QUART;
        return to;
    }
    static double pintToGallon(double from)
    {
        double to;
        to = from * PINT_TO_GAL;
        return to;
    }
    
    //quart conversion methods
    static double quartToTea(double from)
    {
        double to;
        to = from * QUART_TO_TEA;
        return to;
    }
    static double quartToTable(double from)
    {
        double to;
        to = from * QUART_TO_TABLE;
        return to;
    }
    static double quartToCup(double from)
    {
        double to;
        to = from * QUART_TO_CUP;
        return to;
    }
    static double quartToOunce(double from)
    {
        double to;
        to = from * QUART_TO_OUNCE;
        return to;
    }
    static double quartToPint(double from)
    {
        double to;
        to = from * QUART_TO_PINT;
        return to;
    }
    static double quartToGallon(double from)
    {
        double to;
        to = from * QUART_TO_GAL;
        return to;
    }
    
    //gallon conversion methods
    static double galToTea(double from)
    {
        double to;
        to = from * GAL_TO_TEA;
        return to;
    }
    static double galToTable(double from)
    {
        double to;
        to = from * GAL_TO_TABLE;
        return to;
    }
    static double galToCup(double from)
    {
        double to;
        to = from * GAL_TO_CUP;
        return to;
    }
    static double galToOunce(double from)
    {
        double to;
        to = from * GAL_TO_OUNCE;
        return to;
    }
    static double galToPint(double from)
    {
        double to;
        to = from * GAL_TO_PINT;
        return to;
    }
    static double galToQuart(double from)
    {
        double to;
        to = from * GAL_TO_QUART;
        return to;
    }
    
    //method to rule them all (calls the other methods for calculations
    static double convertStuff(String strFrom, String strTo, double from) throws IllegalArgumentException
    {
        //teaspoon
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Teaspoon"))
            {
                if(from > 0)
                {
                    return from;
                }
            } 
            else
            {
                throw new IllegalArgumentException("Please enter a valid number.");
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Tablespoon"))
            {
                double result;
                result = teaToTable((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Ounce"))
            {
                double result;
                result = teaToOunce((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Cup"))
            {
                double result;
                result = teaToCup((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Pint"))
            {
                double result;
                result = teaToPint((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Quart"))
            {
                double result;
                result = teaToQuart((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Teaspoon") && strTo.equals("Gallon"))
            {
                double result;
                result = teaToGallon((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        //tablespoon
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Tablespoon"))
            {
                if(from > 0)
                    {
                        return from;
                    }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Teaspoon"))
            {
                double result;
                result = tableToTea((from));
                if(from > 0)
                {
                    return result;
                }
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Ounce"))
            {
                double result;
                result = tableToOunce((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Cup"))
            {
                double result;
                result = tableToCup((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Pint"))
            {
                double result;
                result = tableToPint((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }    
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Quart"))
            {
                double result;
                result = tableToQuart((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }   
        try
        {
            if(strFrom.equals("Tablespoon") && strTo.equals("Gallon"))
            {
                double result;
                result = tableToGallon((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        //ounce
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Ounce"))
            {
                return from;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Teaspoon"))
            {
                double result;
                result = ounceToTea((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Tablespoon"))
            {
                double result;
                result = ounceToTable((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Cup"))
            {
                double result;
                result = ounceToCup((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Pint"))
            {
                double result;
                result = ounceToPint((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Quart"))
            {
                double result;
                result = ounceToQuart((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Ounce") && strTo.equals("Gallon"))
            {
                double result;
                result = ounceToGallon((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        //cup
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Cup"))
            {
                return from;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Teaspoon"))
            {
                double result;
                result = cupToTea((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Tablespoon"))
            {
                double result;
                result = cupToTable((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Ounce"))
            {
                double result;
                result = cupToOunce((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Pint"))
            {
                double result;
                result = cupToPint((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Quart"))
            {
                double result;
                result = cupToQuart((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Cup") && strTo.equals("Gallon"))
            {
                double result;
                result = cupToGallon((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        //pint
        try
        {
        if(strFrom.equals("Pint") && strTo.equals("Pint"))
            {
                return from;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Pint") && strTo.equals("Teaspoon"))
            {
                double result;
                result = pintToTea((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Pint") && strTo.equals("Tablespoon"))
            {
                double result;
                result = pintToTable((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Pint") && strTo.equals("Cup"))
            {
                double result;
                result = pintToCup((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        
        try
        {
        if(strFrom.equals("Pint") && strTo.equals("Ounce"))
            {
                double result;
                result = pintToOunce((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        
        try
        {
            if(strFrom.equals("Pint") && strTo.equals("Quart"))
            {
            double result;
            result = pintToQuart((from));
            return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Pint") && strTo.equals("Gallon"))
            {
                double result;
                result = pintToGallon((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        
        //quart
        try
        {
        if(strFrom.equals("Quart") && strTo.equals("Quart"))
            {
                return from;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        
        try
        {
        if(strFrom.equals("Quart") && strTo.equals("Teaspoon"))
            {
                double result;
                result = quartToTea((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Quart") && strTo.equals("Tablespoon"))
            {
                double result;
                result = quartToTable((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Quart") && strTo.equals("Cup"))
            {
                double result;
                result = quartToCup((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Quart") && strTo.equals("Ounce"))
            {
                double result;
                result = quartToOunce((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Quart") && strTo.equals("Teaspoon"))
            {
                double result;
                result = quartToTea((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        //gallon
        try
        {
        if(strFrom.equals("Gallon") && strTo.equals("Gallon"))
            {
                return from;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Gallon") && strTo.equals("Teaspoon"))
            {
                double result;
                result = galToTea((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        
        try
        {
        if(strFrom.equals("Gallon") && strTo.equals("Tablespoon"))
            {
                double result;
                result = galToTable((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
        if(strFrom.equals("Gallon") && strTo.equals("Cup"))
            {
                double result;
                result = galToCup((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Gallon") && strTo.equals("Ounce"))
                {
                    double result;
                    result = galToOunce((from));
                    return result;
                }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Gallon") && strTo.equals("Pint"))
                {
                    double result;
                    result = galToPint((from));
                    return result;
                }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        try
        {
            if(strFrom.equals("Gallon") && strTo.equals("Quart"))
            {
                double result;
                result = galToQuart((from));
                return result;
            }
        }
        catch(IllegalArgumentException iae)
        {
                System.out.println(iae.getMessage());
        }
        return 0;
    }
}
