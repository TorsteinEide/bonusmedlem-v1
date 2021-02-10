package no.ntnu.idata2001.eide.bonusmedlem;

/**
 * this Class represents a silver membership of a real life commercial airlines company.
 * this is the second layer of membership a user can have, and from here a user can advance to Gold membership
 *
 * @author torstein
 * @version 0.1
 */
public class SilverMembership extends Membership
{

    private String membershipName; // Name of the level of membership
    private float POINTS_SCALING_FACTOR;

    /**
     * Class constructor initializes the objects
     */
    public SilverMembership()
    {
        membershipName = "Silver";
        POINTS_SCALING_FACTOR = 1.2f;

    }

    /**
     * Calculates the new balance of a users membership after a flight with added silver bonus (20%)
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

        if(bonusPointsBalance >= 25000)
        {
            newBalanceFloat = bonusPointsBalance + (newPoints * POINTS_SCALING_FACTOR);
            newBalance = Math.round(newBalanceFloat);
            bonusPointsBalance = newBalance;
        }

        return bonusPointsBalance;
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
