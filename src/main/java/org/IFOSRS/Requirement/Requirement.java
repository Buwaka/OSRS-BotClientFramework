package org.IFOSRS.Requirement;

import com.google.gson.annotations.SerializedName;
import org.IFOSRS.Logging.Logger;
import java.io.Serializable;

public interface Requirement extends Serializable
{
    enum RequirementType
    {
        Equipment,
        Favor,
        Item,
        Kill,
        Kudos,
        Level,
        CombatLevel,
        QuestPoint,
        Quest,
        Member,
        OR
    }

    @SerializedName("RequirementType")
    RequirementType GetRequirementType();

    static boolean IsAllRequirementMet(Requirement... requirements)
    {
        if(requirements == null)
        {
            Logger.log("Requirement: IsAllRequirementMet: requirements is null, exiting");
            return true;
        }

        for(Requirement req : requirements)
        {
            if(req != null && !req.isRequirementMet())
            {
                Logger.log("Requirement: IsAllRequirementMet: requirement is not met, exiting, " +
                           req);
                return false;
            }
        }
        Logger.log("Requirement: IsAllRequirementMet: all requirements are met");
        return true;
    }

    boolean isRequirementMet();

    static boolean IsAnyRequirementMet(Requirement... requirements)
    {
        if(requirements == null)
        {
            Logger.log("Requirement: IsAnyRequirementMet: requirements is null, exiting");
            return true;
        }

        for(Requirement req : requirements)
        {
            if(req != null && req.isRequirementMet())
            {
                Logger.log("Requirement: IsAnyRequirementMet: true, " + req);
                return true;
            }
        }
        Logger.log("Requirement: IsAnyRequirementMet: false, none are met");
        return false;
    }

}

