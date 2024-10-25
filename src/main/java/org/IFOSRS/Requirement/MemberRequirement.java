package org.IFOSRS.Requirement;

import org.IFOSRS.Singletons.Client.Client;


public class MemberRequirement implements Requirement
{
    private static final long serialVersionUID = 5829362324941237304L;

    /**
     * @return
     */
    @Override
    public RequirementType GetRequirementType()
    {
        return RequirementType.Member;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        return Client.isMembers();
    }
}
