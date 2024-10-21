package org.IFOSRS.Requirement;


public class KillRequirement implements Requirement
{
    private static final long serialVersionUID = 8664327205259346103L;

    public KillRequirement()
    {
        //TODO
    }

    /**
     * @return
     */
    @Override
    public Requirement.RequirementType GetRequirementType()
    {
        return Requirement.RequirementType.Kill;
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
