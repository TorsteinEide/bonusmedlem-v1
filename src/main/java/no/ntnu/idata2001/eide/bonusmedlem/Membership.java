package no.ntnu.idata2001.eide.bonusmedlem;


/**
 * this Class represents a membership of a real life commercial airline company.
 * it registers and calculates the balance and name of a users membership
 *
 * @author torstein
 * @version 0.1
 */
public abstract class Membership
{

    private String membershipName;

    /**
     * Class constructor, initializes the object.
     */
    public Membership()
    {

    }


    /**
     * Calculates the new balance of a users membership account
     * @param bonusPointsBalance is bonusPointsBalance, the balance of points already given.
     * @param newPoints is newPoints, the new amount of points to be added.
     * returns the new Balance of a user
     * @return returns the new balance of a user.
     */
    public abstract int registerPoints(int bonusPointsBalance, int newPoints);



    /**
     * Returns the level of a users membership (Gold, Silver or Basic)
     * @return the level of a users membership (Gold, Silver or Basic)
     */
    public String getMembershipName()
    {

        return membershipName;
    }

}

