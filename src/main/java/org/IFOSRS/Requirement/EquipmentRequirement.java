package org.IFOSRS.Requirement;


public class EquipmentRequirement implements Requirement
{

    private static final long serialVersionUID = 2908955524030585561L;

    public EquipmentRequirement()
    {
        //TODO
    }

    /**
     * @return
     */
    @Override
    public RequirementType GetRequirementType()
    {
        return RequirementType.Equipment;
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
