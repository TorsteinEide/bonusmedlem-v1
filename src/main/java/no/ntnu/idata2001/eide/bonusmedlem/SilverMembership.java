package no.ntnu.idata2001.eide.bonusmedlem;

/**
 * this Class represents a silver membership of a real life commercial airlines company.
 * this is the second layer of membership a user can have, and from here a user can advance to Gold membership
 */
public class SilverMembership extends Membership
{

    private String membershipName;
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
        * @param bonusPointBalance the balance of the user membership.
        * @param newPoints the number of points earned after the flight.
        * returns the new balance of a users membership
        * @return the new balance of a users membership
        */
        @Override
        public double registerPoints(int bonusPointBalance, int newPoints)
        {
            float newBalance = 0;

            newBalance = bonusPointBalance + (newPoints * POINTS_SCALING_FACTOR);
            newBalance = Math.round(newBalance);

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
