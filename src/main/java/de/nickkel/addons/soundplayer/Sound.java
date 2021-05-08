package de.nickkel.addons.soundplayer;

import net.minecraft.util.ResourceLocation;

public enum Sound {

    AMBIENT_CAVE("ambient.cave.cave"),
    AMBIENT_RAIN("ambient.weather.rain"),
    AMBIENT_THUNDER("ambient.weather.thunder"),

    PLAYER_FALL_BIG("game.player.hurt.fall.big"),
    PLAYER_FALL_SMALL("game.player.hurt.fall.small"),
    PLAYER_HURT("game.player.hurt"),
    PLAYER_DIE("game.player.die"),
    PLAYER_SWIM("game.player.swim"),
    PLAYER_SWIM_SPLASH("game.player.swim.splash"),

    NEUTRAL_FALL_BIG("game.neutral.hurt.fall.big"),
    NEUTRAL_FALL_SMALL("game.neutral.hurt.fall.small"),
    NEUTRAL_HURT("game.neutral.hurt"),
    NEUTRAL_DIE("game.neutral.die"),
    NEUTRAL_SWIM("game.neutral.swim"),
    NEUTRAL_SWIM_SPLASH("game.neutral.swim.splash"),

    HOSTILE_FALL_BIG("game.hostile.hurt.fall.big"),
    HOSTILE_FALL_SMALL("game.hostile.hurt.fall.small"),
    HOSTILE_HURT("game.hostile.hurt"),
    HOSTILE_DIE("game.hostile.die"),
    HOSTILE_SWIM("game.hostile.swim"),
    HOSTILE_SWIM_SPLASH("game.hostile.swim.splash"),

    DIG_CLOTH("dig.cloth"),
    DIG_GLASS("dig.glass"),
    DIG_GRASS("dig.grass"),
    DIG_GRAVEL("dig.gravel"),
    DIG_SAND("dig.sand"),
    DIG_SNOW("dig.snow"),
    DIG_STONE("dig.stone"),
    DIG_WOOD("dig.wood"),

    FIRE("fire.fire"),
    FIRE_IGNITE("fire.ignite"),

    FIREBALL("item.fireCharge.use"),

    FIREWORK_LAUNCH("fireworks.launch"),
    FIREWORK_TWINKLE("fireworks.twinkle"),
    FIREWORK_TWINKLE_FAR("fireworks.twinkle_far"),
    FIREWORK_BLAST("fireworks.blast"),
    FIREWORK_BLAST_FAR("fireworks.blast_far"),
    FIREWORK_LARGE_BLAST("fireworks.largeBlast"),
    FIREWORK_LARGE_BLAST_FAR("fireworks.largeBlast_far"),

    LAVA("liquid.lava"),
    LAVA_POP("liquid.lavapop"),

    WATER("liquid.water"),

    MINECART_BASE("minecart.base"),
    MINECART_INSIDE("minecart.inside"),

    BAT_DEATH("mob.bat.death"),
    BAT_HURT("mob.bat.hurt"),
    BAT_IDLE("mob.bat.idle"),
    BAT_LOOP("mob.bat.loop"),
    BAT_TAKEOFF("mob.bat.takeoff"),

    BLAZE_DEATH("mob.blaze.death"),
    BLAZE_HIT("mob.blaze.hit"),
    BLAZE_BREATH("mob.blaze.breath"),

    GUARDIAN_DEATH("mob.guardian.death"),
    GUARDIAN_HIT("mob.guardian.hit"),
    GUARDIAN_IDLE("mob.guardian.idle"),
    GUARDIAN_CURSE("mob.guardian.curse"),
    GUARDIAN_ATTACK("mob.guardian.attack"),
    GUARDIAN_FLOP("mob.guardian.flop"),
    GUARDIAN_ELDER_DEATH("mob.guardian.elder.death"),
    GUARDIAN_ELDER_HIT("mob.guardian.elder.hit"),
    GUARDIAN_ELDER_IDLE("mob.guardian.elder.idle"),
    GUARDIAN_LAND_DEATH("mob.guardian.land.death"),
    GUARDIAN_LAND_HIT("mob.guardian.land.hit"),
    GUARDIAN_LAND_IDLE("mob.guardian.land.idle"),

    CAT_HISS("mob.cat.hiss"),
    CAT_HIT("mob.cat.hitt"),
    CAT_MEOW("mob.cat.meow"),
    CAT_PURR("mob.cat.purr"),
    CAT_PURREOW("mob.cat.purreow"),

    CHICKEN_IDLE("mob.chicken.say"),
    CHICKEN_HURT("mob.chicken.hurt"),
    CHICKEN_STEP("mob.chicken.step"),
    CHICKEN_EGG_POP("mob.chicken.plop"),

    COW_IDLE("mob.cow.say"),
    COW_HURT("mob.cow.hurt"),
    COW_STEP("mob.cow.step"),

    CREEPER_HISS("mob.creeper.say"),
    CREEPER_DEATH("mob.creeper.death"),
    CREEPER_PRIMED("creeper.primed"),

    DRAGON_END("mob.enderdragon.end"),
    DRAGON_GROWL("mob.enderdragon.growl"),
    DRAGON_HIT("mob.enderdragon.hit"),
    DRAGON_WINGS("mob.enderdragon.wings"),

    ENDERMAN_DEATH("mob.endermen.death"),
    ENDERMAN_HIT("mob.endermen.hit"),
    ENDERMAN_IDLE("mob.endermen.idle"),
    ENDERMAN_TELEPORT("mob.endermen.portal"),
    ENDERMAN_SCREAM("mob.endermen.scream"),
    ENDERMAN_STARE("mob.endermen.stare"),

    GHAST_AFFECTIONATE_SCREAM("mob.ghast.affectionate_scream"),
    GHAST_CHARGE("mob.ghast.charge"),
    GHAST_DEATH("mob.ghast.death"),
    GHAST_FIREBALL("mob.ghast.fireball"),
    GHAST_MOAN("mob.ghast.moan"),
    GHAST_SCREAM("mob.ghast.scream"),

    HORSE_ANGRY("mob.horse.angry"),
    HORSE_ARMOR("mob.horse.armor"),
    HORSE_BREATHE("mob.horse.breathe"),
    HORSE_DEATH("mob.horse.death"),
    HORSE_GALLOP("mob.horse.gallop"),
    HORSE_HIT("mob.horse.hit"),
    HORSE_IDLE("mob.horse.idle"),
    HORSE_JUMP("mob.horse.jump"),
    HORSE_LAND("mob.horse.land"),
    HORSE_LEATHER("mob.horse.leather"),
    HORSE_SOFT("mob.horse.soft"),
    HORSE_WOOD("mob.horse.wood"),

    DONKEY_ANGRY("mob.horse.donkey.angry"),
    DONKEY_DEATH("mob.horse.donkey.death"),
    DONKEY_HIT("mob.horse.donkey.hit"),
    DONKEY_IDLE("mob.horse.donkey.idle"),

    HORSE_SKELETON_DEATH("mob.horse.skeleton.death"),
    HORSE_SKELETON_HIT("mob.horse.skeleton.hit"),
    HORSE_SKELETON_IDLE("mob.horse.skeleton.idle"),

    HORSE_ZOMBIE_DEATH("mob.horse.zombie.death"),
    HORSE_ZOMBIE_HIT("mob.horse.zombie.hit"),
    HORSE_ZOMBIE_IDLE("mob.horse.zombie.idle"),

    IRONGOLEM_DEATH("mob.irongolem.death"),
    IRONGOLEM_HIT("mob.irongolem.hit"),
    IRONGOLEM_THROW("mob.irongolem.throw"),
    IRONGOLEM_WALK("mob.irongolem.walk"),

    MAGMACUBE_WALK("mob.magmacube.small"),
    MAGMACUBE_WALK2("mob.magmacube.big"),
    MAGMACUBE_JUMP("mob.magmacube.jump"),

    PIG_DEATH("mob.pig.death"),
    PIG_IDLE("mob.pig.say"),
    PIG_STEP("mob.pig.step"),

    RABBIT_DEATH("mob.rabbit.death"),
    RABBIT_HURT("mob.rabbit.hurt"),
    RABBIT_IDLE("mob.rabbit.idle"),
    RABBIT_HOP("mob.rabbit.hop"),

    SHEEP_IDLE("mob.sheep.say"),
    SHEEP_SHEAR("mob.sheep.shear"),
    SHEEP_STEP("mob.sheep.step"),

    SILVERFISH_HIT("mob.silverfish.hit"),
    SILVERFISH_KILL("mob.silverfish.kill"),
    SILVERFISH_IDLE("mob.silverfish.say"),
    SILVERFISH_WALK("mob.silverfish.step"),

    SKELETON_DEATH("mob.skeleton.death"),
    SKELETON_HURT("mob.skeleton.hurt"),
    SKELETON_IDLE("mob.skeleton.say"),
    SKELETON_STEP("mob.skeleton.step"),

    SLIME_ATTACK("mob.slime.attack"),
    SLIME_BIG("mob.slime.big"),
    SLIME_SMALL("mob.slime.small"),

    SPIDER_DEATH("mob.spider.death"),
    SPIDER_IDLE("mob.spider.say"),
    SPIDER_STEP("mob.spider.step"),

    VILLAGER_DEATH("mob.villager.death"),
    VILLAGER_HAGGLE("mob.villager.haggle"),
    VILLAGER_HIT("mob.villager.hit"),
    VILLAGER_IDLE("mob.villager.idle"),
    VILLAGER_NO("mob.villager.no"),
    VILLAGER_YES("mob.villager.yes"),

    WITHER_DEATH("mob.wither.death"),
    WITHER_HURT("mob.wither.hurt"),
    WITHER_IDLE("mob.wither.idle"),
    WITHER_SHOOT("mob.wither.shoot"),
    WITHER_SPAWN("mob.wither.spawn"),

    WOLF_BARK("mob.wolf.bark"),
    WOLF_DEATH("mob.wolf.death"),
    WOLF_GROWL("mob.wolf.growl"),
    WOLF_HOWL("mob.wolf.howl"),
    WOLF_HURT("mob.wolf.hurt"),
    WOLF_PANT("mob.wolf.panting"),
    WOLF_SHAKE("mob.wolf.shake"),
    WOLF_STEP("mob.wolf.step"),
    WOLF_WHINE("mob.wolf.whine"),

    ZOMBIE_DEATH("mob.zombie.death"),
    ZOMBIE_HURT("mob.zombie.hurt"),
    ZOMBIE_INFECT("mob.zombie.infect"),
    ZOMBIE_METAL("mob.zombie.metal"),
    ZOMBIE_REMEDY("mob.zombie.remedy"),
    ZOMBIE_IDLE("mob.zombie.say"),
    ZOMBIE_STEP("mob.zombie.step"),
    ZOMBIE_UNFECT("mob.zombie.unfect"),
    ZOMBIE_WOOD("mob.zombie.wood"),
    ZOMBIE_WOODBREAK("mob.zombie.woodbreak"),

    PIGMAN_IDLE("mob.zombiepig.zpig"),
    PIGMAN_ANGRY("mob.zombiepig.zpigangry"),
    PIGMAN_DEATH("mob.zombiepig.zpigdeath"),
    PIGMAN_HURT("mob.zombiepig.zpighurt"),

    NOTE_BASS("note.bass"),
    NOTE_BASS_GUITAR("note.bassattack"),
    NOTE_BASS_DRUM("note.bd"),
    NOTE_PIANO("note.harp"),
    NOTE_PLING("note.pling"),
    NOTE_SNARE_DRUM("note.snare"),
    NOTE_STICKS("note.hat"),

    PORTAL("portal.portal"),
    PORTAL_TRAVEL("portal.travel"),
    PORTAL_TRIGGER("portal.trigger"),

    ANVIL_BREAK("random.anvil_break"),
    ANVIL_LAND("random.anvil_land"),
    ANVIL_USE("random.anvil_use"),


    ARROW_HIT("random.bowhit"),
    ARROW_SHOOT("random.bow"),

    ITEM_BREAK("random.break"),
    ITEM_PICKUP("random.pop"),


    BURP("random.burp"),

    CHEST_CLOSE("random.chestclosed"),
    CHEST_OPEN("random.chestopen"),

    BUTTON_PRESS("gui.button.press"),
    CLICK("random.click"),

    DOOR_CLOSE("random.door_close"),
    DOOR_OPEN("random.door_open"),

    DRINK("random.drink"),
    EAT("random.eat"),
    EXPLODE("random.explode"),
    FIZZ("random.fizz"),
    TNT_PRIMED("game.tnt.primed"),

    POTION_SMASH("game.potion.smash"),
    LEVEL_UP("random.levelup"),
    LEVEL_ORB_PICKUP("random.orb"),

    SPLASH("random.splash"),
    HIT("random.successful_hit"),

    WOOD_CLICK("random.wood_click"),

    RECORD_11("records.11"),
    RECORD_13("records.13"),
    RECORD_BLOCKS("records.blocks"),
    RECORD_CAT("records.cat"),
    RECORD_CHIRP("records.chirp"),
    RECORD_FAR("records.far"),
    RECORD_MALL("records.mall"),
    RECORD_MELLOHI("records.mellohi"),
    RECORD_STAL("records.stal"),
    RECORD_STRAD("records.strad"),
    RECORD_WAIT("records.wait"),
    RECORD_WARD("records.ward"),

    STEP_CLOTH("step.cloth"),
    STEP_GRASS("step.grass"),
    STEP_GRAVEL("step.gravel"),
    STEP_LADDER("step.ladder"),
    STEP_SAND("step.sand"),
    STEP_SNOW("step.snow"),
    STEP_STONE("step.stone"),
    STEP_WOOD("step.wood"),

    PISTON_EXTEND("tile.piston.out"),
    PISTON_RETRACT("tile.piston.in"),

    MUSIC_MENU("music.menu"),
    MUSIC_GAME("music.game"),
    MUSIC_GAME_CREATIVE("music.game.creative"),
    MUSIC_GAME_END("music.game.end"),
    MUSIC_GAME_END_DRAGON("music.game.end.dragon"),
    MUSIC_GAME_END_CREDIT("music.game.end.credit"),
    MUSIC_GAME_NETHER("music.game.nether");

    public static final Sound[] VALUES = values();

    private final String key;

    Sound(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public ResourceLocation getResourceLocation() {
        return new ResourceLocation(key);
    }
}