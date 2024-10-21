package org.IFOSRS.Requirement;


public class KudosRequirement implements Requirement
{

    private static final long serialVersionUID = 3339472580663162929L;

    public KudosRequirement()
    {
        //TODO
    }

    /**
     * @return
     */
    @Override
    public Requirement.RequirementType GetRequirementType()
    {
        return Requirement.RequirementType.Kudos;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        return false;
    }

}
