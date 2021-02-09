package no.ntnu.idata2001.eide.bonusmedlem;
import java.time.LocalDate;
import java.util.HashMap;


/**
 * This class represents a member Archive in which users (members) are to be stored with all corresponding information and personal data (name etc.)
 */
public class MemberArchive
{
    private HashMap<Integer, BonusMember> bonusmembers;

    /**
     * Class constructor initializes an object of the class
     */
    public MemberArchive()
    {
        this.bonusmembers = new HashMap<>();
    }

    /**
     * Adds a user to the member archive
     * @param bonusMember Credentials of a new member profile.
     * returns a boolean value of false or true, depending on if a user is done adding a new member
     * @return a boolean value of false or true, depending on if a user is done adding a new member
     */
    public int addMember(BonusMember bonusMember)
    {
        int memberNumber = 0;

        this.bonusmembers.put(bonusMember.getMemberNumber(), bonusMember);
        memberNumber = bonusMember.getMemberNumber();

        return memberNumber;
    }

    /**
     * Adds given number of points to an assigned member number
     * @param memberNumber member number to which the bonus points are to be assigned
     * @param bonusPoints bonus points to be assigned to a given member number
     * returns a boolean value of true or false, depending on if a user is done adding points
     * @return a boolean value of true or false, depending on if a user is done adding points
     */
    public boolean registerPoints(int memberNumber, int bonusPoints)
    {
        boolean memberNumberValid = true;

        if(this.bonusmembers.containsKey(memberNumber))
        {
            BonusMember bonusMember = this.bonusmembers.get(memberNumber);
            bonusMember.registerBonusPoints(bonusPoints);
        } else {
            memberNumberValid = false;
        }

        return memberNumberValid;
    }

    /**
     * Lists all members by member number, name and email address
     */
    public void listAllMembers()
    {
        for(BonusMember bonusMember : this.bonusmembers.values())
        {
            bonusMember.printMemberInfo();
        }
    }


    /**
     * Finds the total number of points in a users wallet (balance)
     * returns the total number of points in a users wallet (balance)
     * @return the total number of points in a users wallet (balance)
     */
    private int findPoints(int memberNumber, String password)
    {
        int totalPoints = 0;


        BonusMember bonusMember = this.bonusmembers.get(memberNumber);


        if(bonusMember.checkPassword(password))
        {
            totalPoints = bonusMember.getBonusPointsBalance();
        } else {
            totalPoints = -1000; // preset to -1000 because the assignment states that it should return a negative value
        }

        return totalPoints;
    }

    /**
     * Fills the archive with dummy profiles for testing
     */
    private void fillRegisterWithTestData()
    {
        this.bonusmembers.put(1, new BonusMember(1, LocalDate.now(), 31200, "Torstein Eide", "taurstein@gmail.com"));
        this.bonusmembers.put(2, new BonusMember(2, LocalDate.now(), 14400, "Sebastian Nord", "Sebbe@mail.com"));
        this.bonusmembers.put(3, new BonusMember(3, LocalDate.now(), 13990, "Iris Olene Bårdsen", "Irismail@olene.com"));
        this.bonusmembers.put(4, new BonusMember(4, LocalDate.now(), 36759, "Mail Mannesen", "mailmail@mailman.com"));
        this.bonusmembers.put(5, new BonusMember(5, LocalDate.now(), 36539, "Yoga Mattesen", "Yogamatte@viktig.no"));
    }



}
