package no.ntnu.idata2001.eide.bonusmedlem;


public class GoldMembership extends Membership
{
    /**
     * this Class represents a Gold membership of a real life commercial airlines company.
     * this is the third and final layer of membership a user can have, and from here a user can not advance any further
     */

    private String membershipName; // Name of the level of membership
    private float POINTS_SCALING_FACTOR_LEVEL_1;
    private float POINTS_SCALING_FACTOR_LEVEL_2;

    /**
     * Class constructor initializes the objects
     */
    public GoldMembership()
    {
        membershipName = "Silver";
        POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
        POINTS_SCALING_FACTOR_LEVEL_2 = 1.5f;
    }

    /**
     * Calculates the new balance of a users membership after a flight with added gold bonus (30%)
     * @param bonusPointsBalance the balance of the user membership.
     * @param newPoints the number of points earned after the flight.
     * returns the new balance of a users membership
     * @return the new balance of a users membership
     */
    @Override
    public int registerPoints(int bonusPointsBalance, int newPoints)
    {
        int newBalance = 0;
        float newBalanceFloat = 0;

        if(bonusPointsBalance > 90000)
        {
            newBalanceFloat = bonusPointsBalance + (newPoints * POINTS_SCALING_FACTOR_LEVEL_2);
            newBalance = Math.round(newBalanceFloat);

        } else if(bonusPointsBalance < 90000)
        {
            newBalanceFloat = bonusPointsBalance + (newPoints * POINTS_SCALING_FACTOR_LEVEL_1);
            newBalance = Math.round(newBalanceFloat);
        }
        return newBalance;
    }

    /**
     * returns the name of the membership
     * @return the name of the membership
     */
    @Override
    public String getMembershipName()
    {

        return membershipName;
    }









}
