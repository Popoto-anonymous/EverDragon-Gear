package everlastingdragon;

import legend.core.GameEngine;
import legend.game.characters.ElementSet;
import legend.game.inventory.Equipment;
import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.ItemIcon;
import legend.game.types.EquipmentSlot;
import legend.lodmod.LodMod;
import org.legendofdragoon.modloader.registries.Registrar;
import org.legendofdragoon.modloader.registries.RegistryDelegate;

public class Equipments {
  private Equipments() { }

  private static final Registrar<Equipment, EquipmentRegistryEvent> EQUIPMENT_REGISTRAR = new Registrar<>(GameEngine.REGISTRIES.equipment, EverlastingDragon.MOD_ID);

  // UNIVERSAL ARMORS

  public static final RegistryDelegate<Equipment> KNIGHTDRAGONS_HELM = EQUIPMENT_REGISTRAR.register("knightdragons_helm", () -> new Equipment(150, 0x0, EquipmentSlot.HELMET, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 25, 0, false, false, false, false, 0, 1, 3, 25, 0, ItemIcon.HELM, 0, 0, 28, 0, 5, 0, 10, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> LADYDRAGONS_HELM = EQUIPMENT_REGISTRAR.register("ladydragons_helm", () -> new Equipment(150, 0x0, EquipmentSlot.HELMET, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 25, 0, false, false, false, false, 0, 1, 3, 25, 0, ItemIcon.HELM, 0, 0, 33, 5, 0, 0, 10, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> KNIGHTDRAGONS_ARMOR = EQUIPMENT_REGISTRAR.register("knightdragons_armor", () ->  new Equipment(150, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 6, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 21, 25, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> LADYDRAGONS_ARMOR = EQUIPMENT_REGISTRAR.register("ladydragons_armor", () ->  new Equipment(150, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 6, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 16, 30, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> MARTIALDRAGONS_ARMOR = EQUIPMENT_REGISTRAR.register("martialdragons_armor", () ->  new Equipment(150, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 6, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 32, 31, 0, 0, 10, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> GIANTDRAGONS_ARMOR = EQUIPMENT_REGISTRAR.register("giantdragons_armor", () ->  new Equipment(150, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 6, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 50, 25, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> EVERDRAGONS_BOOTS = EQUIPMENT_REGISTRAR.register("everdragons_boots", () -> new Equipment(150, 0x0, EquipmentSlot.BOOTS, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 1, 3, 25, 10, ItemIcon.BOOTS, 5, 0, 0, 5, 0, 0, 0, 5, 5, 0, 0x0));
  public static final RegistryDelegate<Equipment> EVERDRAGONS_RING = EQUIPMENT_REGISTRAR.register("everdragons_ring", () -> new Equipment(150, 0x0, EquipmentSlot.ACCESSORY, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 1, 3, 25, 0, ItemIcon.RING, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0x0));

  public static final RegistryDelegate<Equipment> KNIGHTDRAGONS_GREATHELM = EQUIPMENT_REGISTRAR.register("knightdragons_greathelm", () -> new Equipment(300, 0x0, EquipmentSlot.HELMET, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x4e, 0, 0, 0, 0, 0, 50, 0, false, false, false, false, 0, 1, 5, 25, 0, ItemIcon.HELM, 0, 0, 50, 0, 10, 0, 10, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> LADYDRAGONS_GREATHELM = EQUIPMENT_REGISTRAR.register("ladydragons_greathelm", () -> new Equipment(300, 0x0, EquipmentSlot.HELMET, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x4e, 0, 0, 0, 0, 0, 50, 0, false, false, false, false, 0, 1, 5, 25, 0, ItemIcon.CROWN, 0, 0, 50, 10, 0, 0, 10, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> FIREDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("firedragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.FIRE_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 40, 40, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> WINDDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("winddragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.WIND_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 40, 40, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> LIGHTDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("lightdragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.LIGHT_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 30, 40, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> DARKDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("darkdragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.DARK_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 30, 40, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> THUNDERDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("thunderdragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.THUNDER_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 41, 30, 0, 0, 10, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> EARTHDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("earthdragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.EARTH_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 80, 30, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> WATERDRAGONS_MEDIUMARMOR = EQUIPMENT_REGISTRAR.register("waterdragons_mediumarmor", () ->  new Equipment(300, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.WATER_ELEMENT.get()), new ElementSet(), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 10, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 30, 40, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> EVERDRAGONS_GREAVES = EQUIPMENT_REGISTRAR.register("everdragons_greaves", () -> new Equipment(300, 0x0, EquipmentSlot.BOOTS, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 1, 5, 25, 15, ItemIcon.KNEEPIECE, 10, 0, 0, 5, 0, 10, 0, 10, 10, 0, 0x0));
  public static final RegistryDelegate<Equipment> EVERDRAGONS_GAUNTLETS = EQUIPMENT_REGISTRAR.register("everdragons_gauntlets", () -> new Equipment(300, 0x0, EquipmentSlot.ACCESSORY, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 1, 5, 25, 0, ItemIcon.GLOVE, 0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0x0));

  public static final RegistryDelegate<Equipment> EVERDRAGONS_TRUESCALEHELM = EQUIPMENT_REGISTRAR.register("everdragons_truescalehelm", () -> new Equipment(450, 0x0, EquipmentSlot.HELMET, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x4e, 0, 0, 0, 0, 0, 100, 0, false, false, false, false, 0, 1, 8, 25, 0, ItemIcon.HELM, 0, 0, 55, 10, 10, 0, 15, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> FIREDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("firedragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.WATER_ELEMENT.get()), new ElementSet(LodMod.FIRE_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 51, 50, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> WINDDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("winddragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.EARTH_ELEMENT.get()), new ElementSet(LodMod.WIND_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 64, 37, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> LIGHTDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("lightdragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.DARK_ELEMENT.get()), new ElementSet(LodMod.LIGHT_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 37, 90, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> DARKDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("darkdragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.LIGHT_ELEMENT.get()), new ElementSet(LodMod.DARK_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 51, 52, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> THUNDERDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("thunderdragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(LodMod.THUNDER_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 55, 50, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> EARTHDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("earthdragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.WIND_ELEMENT.get()), new ElementSet(LodMod.EARTH_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 98, 33, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> WATERDRAGONS_TRUESCALEARMOR = EQUIPMENT_REGISTRAR.register("waterdragons_truescalearmor", () ->  new Equipment(450, 0x0, EquipmentSlot.ARMOUR, LodMod.NO_ELEMENT.get(), new ElementSet(LodMod.FIRE_ELEMENT.get()), new ElementSet(LodMod.WATER_ELEMENT.get()), 0xb0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 2, 11, 25, 0, ItemIcon.ARMOR, 0, 0, 0, 40, 64, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> EVERDRAGONS_TRUESCALEGREAVES = EQUIPMENT_REGISTRAR.register("everdragons_truescalegreaves", () -> new Equipment(450, 0x0, EquipmentSlot.BOOTS, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 1, 8, 25, 20, ItemIcon.KNEEPIECE, 15, 0, 0, 5, 0, 15, 0, 10, 10, 0, 0x0));
  public static final RegistryDelegate<Equipment> EVERDRAGONS_TRUESCALEGAUNTLETS = EQUIPMENT_REGISTRAR.register("everdragons_truescalegauntlets", () -> new Equipment(450, 0x0, EquipmentSlot.ACCESSORY, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 1, 8, 25, 0, ItemIcon.GLOVE, 0, 25, 25, 0, 0, 0, 0, 0, 0, 0, 0x0));

  // WEAPONS

  //DART

  public static final RegistryDelegate<Equipment> DRAGON_BLADE = EQUIPMENT_REGISTRAR.register("dragon_blade", () -> new Equipment(75, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> SCALE_EDGE = EQUIPMENT_REGISTRAR.register("scale_edge", () -> new Equipment(200, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> TRUESCALE_GRADIANT = EQUIPMENT_REGISTRAR.register("truescale_gradiant", () -> new Equipment(300, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));

  //LAVBERT

  public static final RegistryDelegate<Equipment> DRAGON_SPEAR = EQUIPMENT_REGISTRAR.register("dragon_spear", () -> new Equipment(75, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SPEAR, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> SCALE_POINT = EQUIPMENT_REGISTRAR.register("scale_point", () -> new Equipment(137, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SPEAR, 0, 41, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> TRUESCALE_PRISM = EQUIPMENT_REGISTRAR.register("truescale_prism", () -> new Equipment(300, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SPEAR, 0, 68, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));

  //SHARANDA

  public static final RegistryDelegate<Equipment> DRAGON_SHORTBOW = EQUIPMENT_REGISTRAR.register("dragon_shortbow", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.BOW, 0, 21, 0, 0, 0, 20, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> SCALE_LONGBOW = EQUIPMENT_REGISTRAR.register("scale_longbow", () -> new Equipment(220, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.BOW, 0, 35, 0, 0, 0, 0, 20, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> TRUESCALE_BEACON = EQUIPMENT_REGISTRAR.register("truescale_beacon", () -> new Equipment(300, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.BOW, 0, 65, 0, 0, 0, 20, 0, 0, 0, 0, 0x0));

  //ROSE

  public static final RegistryDelegate<Equipment> DRAGON_SHORTBLADE = EQUIPMENT_REGISTRAR.register("dragon_shortblade", () -> new Equipment(125, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 21, 0, 0, 0, 0, 0, 0, 0, 20, 0x8));
  public static final RegistryDelegate<Equipment> SCALE_SCRAPER = EQUIPMENT_REGISTRAR.register("scale_scraper", () -> new Equipment(200, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 37, 0, 0, 0, 0, 0, 0, 0, 20, 0x10));
  public static final RegistryDelegate<Equipment> TRUESCALE_DESPAIR = EQUIPMENT_REGISTRAR.register("truescale_despair", () -> new Equipment(350, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.SWORD, 0, 70, 0, 0, 0, 0, 0, 0, 0, 20, 0x0));

  //HASCHEL

  public static final RegistryDelegate<Equipment> DRAGON_FIST = EQUIPMENT_REGISTRAR.register("dragon_fist", () -> new Equipment(125, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.KNUCKLE, 0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> SCALE_CRUSHER = EQUIPMENT_REGISTRAR.register("scale_crusher", () -> new Equipment(200, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.KNUCKLE, 0, 45, 0, 0, 0, 0, 0, 0, 0, 10, 0x0));
  public static final RegistryDelegate<Equipment> TRUESCALE_DESTROYER = EQUIPMENT_REGISTRAR.register("truescale_destroyer",() -> new TruescaleDestroyer(300));

  //MERU

  public static final RegistryDelegate<Equipment> DRAGON_HAMMER = EQUIPMENT_REGISTRAR.register("dragon_hammer", () -> new Equipment(125, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.HAMMER, 0, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> SCALE_MAUL = EQUIPMENT_REGISTRAR.register("scale_maul", () -> new Equipment(200, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.HAMMER, 0, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> TRUESCALE_ICEBREAKER = EQUIPMENT_REGISTRAR.register("truescale_icebreaker", () -> new Equipment(300, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.HAMMER, 0, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));

  //KONGOL

  public static final RegistryDelegate<Equipment> DRAGON_AXE = EQUIPMENT_REGISTRAR.register("dragon_axe", () -> new Equipment(125, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.AXE, 0, 52, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> SCALE_CLEAVER = EQUIPMENT_REGISTRAR.register("scale_cleaver", () -> new Equipment(200, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.AXE, 0, 69, 0, 0, 0, 0, 0, 0, 0, 0, 0x0));
  public static final RegistryDelegate<Equipment> TRUESCALE_REAVER = EQUIPMENT_REGISTRAR.register("truescale_reaver", () -> new Equipment(300, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, 0, 0, ItemIcon.AXE, 0, 100, 0, 0, 0, 0, 0, 0, 0, 20, 0x0));

  static void register(final EquipmentRegistryEvent event) { EQUIPMENT_REGISTRAR.registryEvent(event);}
}
