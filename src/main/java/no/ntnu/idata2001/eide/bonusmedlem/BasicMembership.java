package no.ntnu.idata2001.eide.bonusmedlem;


/**
 * this Class represents a basic membership of a real life commercial airlines company.
 * this is the first layer of membership a user can have, and from here a user can advance to Gold or Silver membership
 */
public class BasicMembership extends Membership
{
    private String membershipName; // Name of the level of membership

    /**
     * Class constructor initializes the objects
     */
    public BasicMembership()
    {
        membershipName = "Basic";
    }

    /**
     * Calculates the new balance of a users membership after a flight
     * @param bonusPointsBalance the balance of the user membership.
     * @param newPoints the number of points earned after the flight.
     * returns the new balance of a users membership
     * @return the new balance of a users membership
     */
    @Override
    public int registerPoints(int bonusPointsBalance, int newPoints)
    {
        int newBalance = 0;

        newBalance = bonusPointsBalance + newPoints;

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
