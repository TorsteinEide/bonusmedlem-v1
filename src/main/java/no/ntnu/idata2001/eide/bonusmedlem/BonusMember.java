package no.ntnu.idata2001.eide.bonusmedlem;
import java.time.LocalDate;


/**
 * This class represents a real life BonusMember profile to be used in a commercial airline company.
 *
 * @author torstein
 * @version 0.1
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
    public BonusMember(int memberNumber, LocalDate enrolledDate, int bonusPoints, String name, String eMailadress)
    {
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPoints;
        this.name = name;
        this.eMailadress = eMailadress;
        this.password = null;

        checkAndSetMembership();

    }

    /**
     * Checks if the password is correct, if yes it will return true, if not it will return false.
     * @param suggestedPassword the suggested password to be checked
     * returns true if the entered suggested password is correct, false if not.
     * @return true if the entered suggested password is correct, false if not.
     */
    public boolean checkPassword(String suggestedPassword)
    {
        boolean validPassword = false;

        // Guard condition
        if(suggestedPassword == null)
        {
            validPassword = false;
        }

        if(suggestedPassword.equals(password))
        {
            validPassword = true;
        } else {
            validPassword = false;
        }

        return validPassword;
    }

    /**
     * Takes the number of points after a flight to be added to balance.
     * @param newPoints the amount of new points earned by a user
     */
    public void registerBonusPoints(int newPoints)
    {
        this.bonusPointsBalance = membership.registerPoints(bonusPointsBalance, newPoints);
        checkAndSetMembership();
    }

    /**
     *  Checks a users current balance and assigns a level of membership to the account
     */
    private void checkAndSetMembership()
    {
        if(bonusPointsBalance < SILVER_LIMIT){

            this.membership = new BasicMembership(); // Basic-membership

        } else if(bonusPointsBalance < GOLD_LIMIT)
        {
            this.membership = new SilverMembership(); // Silver-membership

        } else if(bonusPointsBalance >= GOLD_LIMIT){

            this.membership = new GoldMembership(); // Gold-membership

        }
    }

    /**
     * Prints all information linked to a members account
     */
    public void printMemberInfo()
    {
        System.out.println("@<---------------------------->@");
        System.out.println("Member number: " + getMemberNumber());
        System.out.println("Name: " + getName());
        System.out.println("Mail: " + geteMailadress());
        System.out.println("Points: " + getBonusPointsBalance());
        System.out.println("Membership type: " + getMembershipName());
        System.out.println();
    }

    /**
     * returns a users memberNumber
     * @return a users memberNumber
     */
    public int getMemberNumber()
    {
        return memberNumber;
    }

    /**
     * returns a users enrolled date (registered date)
     * @return a users enrolled date (registered date)
     */
    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    /**
     * returns a users point balance (number of current points)
     * @return a users point balance (number of current points)
     */
    public int getBonusPointsBalance()
    {
        return bonusPointsBalance;
    }

    /**
     * returns a users registered name
     * @return a users registered name
     */
    public String getName()
    {
        return name;
    }

    /**
     * returns a users registered eMail adress
     * @return a users registered eMail adress
     */
    public String geteMailadress()
    {
        return eMailadress;
    }

    /**
     * returns a users registered password
     * @return a users registered password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * returns the credentials of a users membership status (gold, silver or basic.)
     * @return
     */
    public Membership getMembership()
    {
        return membership;
    }

    /**
     * returns the name of a membership (Gold, silver or basic)
     * @return the name of a membership (Gold, silver or basic)
     */
    public String getMembershipName()
    {
        return this.membership.getMembershipName();
    }



}