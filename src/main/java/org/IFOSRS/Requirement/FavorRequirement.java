package org.IFOSRS.Requirement;


import org.IFOSRS.Singletons.PlayerSettings;
import org.IFOSRS.Singletons.Varbit;

public class FavorRequirement implements Requirement
{
    private static final long serialVersionUID = -3503527546478455791L;
    House house;
    int   favour;

    enum House
    {
        ARCEUUS(4896),
        HOSIDIUS(4895),
        LOVAKENGJ(4898),
        PISCARILIUS(4899),
        SHAYZIEN(4894);


        House(int varbit)
        {
            this.varbit = varbit;
        }

        int varbit;

        public int getValue()
        {
            return Varbit.getBitValue(this.getVarbit());
        }

        public double getPercent()
        {
            return (double) this.getValue() / 10.0;
        }

        int getVarbit()
        {
            return varbit;
        }
    }

    public FavorRequirement(House house, int favour)
    {
        this.house  = house;
        this.favour = favour;
    }

    /**
     * @return
     */
    @Override
    public Requirement.RequirementType GetRequirementType()
    {
        return Requirement.RequirementType.Favor;
    }

    /**
     * @return
     */
    @Override
    public boolean isRequirementMet()
    {
        return favour >= house.getValue();
    }
}
