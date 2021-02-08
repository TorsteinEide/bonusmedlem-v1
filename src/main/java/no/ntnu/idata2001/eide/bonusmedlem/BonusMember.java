package no.ntnu.idata2001.eide.bonusmedlem;
import java.time.LocalDate;


/**
 * This class represents a real life BonusMember profile to be used in a commercial airline company.
 */
public class BonusMember
{
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance;
    private String name;
    private String eMailadress;
    private String password;

    private Membership membership;

        /**
         * Class constructor initializes the objects of the class.
         */
        public BonusMember()
        {

        }

    /**
     * returns a users memberNumber
     * @return a users memberNumber
     */
    public int getMemberNumber()
        {
                return memberNumber;
        }

}