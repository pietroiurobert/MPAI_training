package battlerobots;

import battlerobots.domain.MeleeRobot;
import battlerobots.domain.RangedRobot;
import battlerobots.domain.SimpleRobot;

/**
 *
 * @author null
 */
public class BattleRobots {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot("engine", "chasis");
        System.out.println(robot.fight());
        MeleeRobot upgradedRobot = new MeleeRobot(robot);
        System.out.println("melee " + upgradedRobot.fight());
        RangedRobot evenMoreUpgradedRobot = new RangedRobot(upgradedRobot);
        System.out.println("ranged " + evenMoreUpgradedRobot.fight());


    }
    
}
