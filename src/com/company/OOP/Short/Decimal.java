package com.company.OOP.Short;

public class Decimal {
    private float ShortOneFirst;
    private float ShortOneSecond;
    private float ShortTwoFirst;
    private float ShortTwoSecond;

    public double Addition(float shortOneFirst, float shortOneSecond, float shortTwoFirst, float shortTwoSecond) {
        return (shortOneFirst / shortOneSecond) + (shortTwoFirst / shortTwoSecond);
    }

    public double Substraction(float shortOneFirst, float shortOneSecond, float shortTwoFirst, float shortTwoSecond) {
        return (shortOneFirst / shortOneSecond) - (shortTwoFirst / shortTwoSecond);
    }
    public double Multiplication(float shortOneFirst, float shortOneSecond, float shortTwoFirst, float shortTwoSecond) {
        return (shortOneFirst / shortOneSecond) * (shortTwoFirst / shortTwoSecond);
    }
    public double Division(float shortOneFirst, float shortOneSecond, float shortTwoFirst, float shortTwoSecond) {
        return (shortOneFirst / shortOneSecond) / (shortTwoFirst / shortTwoSecond);
    }
    public void Comparing (float shortOneFirst, float shortOneSecond, float shortTwoFirst, float shortTwoSecond) {
        if((shortOneFirst / shortOneSecond) > (shortTwoFirst / shortTwoSecond))
            System.out.println(shortOneFirst/shortOneSecond + " > " + shortTwoFirst /shortTwoSecond );
        else if((shortOneFirst / shortOneSecond) < (shortTwoFirst / shortTwoSecond))
            System.out.println(shortOneFirst/shortOneSecond + " < " + shortTwoFirst /shortTwoSecond );
        else if((shortOneFirst / shortOneSecond) == (shortTwoFirst / shortTwoSecond))
            System.out.println(shortOneFirst/shortOneSecond + " == " + shortTwoFirst /shortTwoSecond );
    }

}
