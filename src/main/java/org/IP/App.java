package org.IP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        AttackRange attackRange = new AttackRange();
        CastSpell castSpell = new CastSpell();
        List<Ability> abilityList = new ArrayList<>(Arrays.asList(attackRange,castSpell));
        System.out.println(castSpell.getValue());
        System.out.println( "Hello World!" );
    }
}
