package com.Patterns.abstractFactory.abstractFabriecs;

import com.Patterns.abstractFactory.*;

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
