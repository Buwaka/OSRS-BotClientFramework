package org.IFOSRS.Requirement;



public class ORRequirement implements Requirement
{

    private static final long serialVersionUID = 8672484086162215074L;
    Requirement[] Requirements;

    public ORRequirement(Requirement... reqs)
    {
        if(reqs != null)
        {
            Requirements = reqs;
        }
    }

    /**
     * @return
     */
    @Override
    public RequirementType GetRequirementType()
    {
        return RequirementType.OR;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        return Requirement.IsAnyRequirementMet(Requirements);
    }
}
