package com.Patterns.abstractFactory.abstractFabriecs;

import com.Patterns.abstractFactory.Profession;
import com.Patterns.abstractFactory.Skills;
import com.Patterns.abstractFactory.WorkExperience;

public abstract class Abstract_Factory {
    public abstract Profession creatProfession();

    public abstract Skills creatSkills();

    public abstract WorkExperience creatWorkExperience();
}
