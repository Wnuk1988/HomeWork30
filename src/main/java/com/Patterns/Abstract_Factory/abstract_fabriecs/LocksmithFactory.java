package com.Patterns.Abstract_Factory.abstract_fabriecs;

import com.Patterns.Abstract_Factory.*;

public class LocksmithFactory extends Abstract_Factory{
    @Override
    public Profession creatProfession() {
        return new LocksmithProfession();
    }

    @Override
    public Skills creatSkills() {
        return new LocksmithSkills();
    }

    @Override
    public WorkExperience creatWorkExperience() {
        return new LocksmithWorkExperience();
    }
}
