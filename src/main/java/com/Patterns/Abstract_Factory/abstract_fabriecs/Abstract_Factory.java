package com.Patterns.Abstract_Factory.abstract_fabriecs;

import com.Patterns.Abstract_Factory.Profession;
import com.Patterns.Abstract_Factory.Skills;
import com.Patterns.Abstract_Factory.WorkExperience;

public abstract class Abstract_Factory {
    public abstract Profession creatProfession();

    public abstract Skills creatSkills();

    public abstract WorkExperience creatWorkExperience();
}
