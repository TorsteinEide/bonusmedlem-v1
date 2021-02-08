package no.ntnu.idata2001.eide.bonusmedlem;


public class GoldMembership extends Membership
{
    /**
     * this Class represents a Gold membership of a real life commercial airlines company.
     * this is the third and final layer of membership a user can have, and from here a user can not advance any further
     */
    
        private String membershipName;
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
         * @param bonusPointBalance the balance of the user membership.
         * @param newPoints the number of points earned after the flight.
         * returns the new balance of a users membership
         * @return the new balance of a users membership
         */
        @Override
        public double registerPoints(int bonusPointBalance, int newPoints)
        {
            float newBalance = 0;
            if(bonusPointBalance > 90000)
            {
                newBalance = bonusPointBalance + (newPoints * POINTS_SCALING_FACTOR_LEVEL_2);
                newBalance = Math.round(newBalance);

            } else {
                newBalance = bonusPointBalance + (newPoints * POINTS_SCALING_FACTOR_LEVEL_1);
                newBalance = Math.round(newBalance);
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
