package everlastingdragon;

import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.EquipmentTypes;
import legend.game.inventory.GatherEquipmentTypesEvent;
import legend.game.inventory.screens.ShopScreen;
import legend.game.modding.events.inventory.ShopContentsEvent;
import legend.lodmod.LodShops;
import org.legendofdragoon.modloader.Mod;
import org.legendofdragoon.modloader.events.EventListener;
import org.legendofdragoon.modloader.registries.RegistryId;

import static legend.core.GameEngine.EVENTS;

@Mod(id = EverlastingDragon.MOD_ID, version = "^3.0.0")
public class EverlastingDragon {
  public static final String MOD_ID = "everlastingdragon";

  public EverlastingDragon() {
    EVENTS.register(this);
  }

  public static RegistryId id(final String entryId) {
    return new RegistryId(MOD_ID, entryId);
  }

  @EventListener
  public void registerEquipments(final EquipmentRegistryEvent event) { Equipments.register(event); }

  @EventListener
  public void shopEquipmentEvent(final ShopContentsEvent event) {
    if(event.shop.shopType_00 == 1) return;

    switch(event.shop.getRegistryId().entryId()) {
      case "lohan_equipment_shop", "kazas_equipment_shop", "fletz_equipment_shop", "donau_equipment_shop", "queen_fury_equipment_shop", "fueno_equipment_shop" -> {
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_HELM.get(), 300));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_ARMOR.get(), 300));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_BOOTS.get(), 300));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_RING.get(), 300));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_BLADE.get(), 200));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_SPEAR.get(), 200));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_SHORTBOW.get(), 200));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_SHORTBLADE.get(), 200));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_FIST.get(), 200));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_HAMMER.get(), 200));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.DRAGON_AXE.get(), 200));
      }
      case "furni_equipment_shop", "deningrad_equipment_shop", "wingly_forest_equipment_shop", "kashua_equipment_shop", "vellweb_equipment_shop" -> {
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_GREATHELM.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_PLATEARMOR.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_GREAVES.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_GAUNTLETS.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_EDGE.get(), 400));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_POINT.get(), 400));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_LONGBOW.get(), 400));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_SCRAPER.get(), 400));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_CRUSHER.get(), 400));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_MAUL.get(), 400));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.SCALE_CLEAVER.get(), 400));
      }
      case "zenebatos_equipment_shop", "moon_equipment_shop" -> {
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_TRUESCALEHELM.get(), 900));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_TRUESCALEARMOR.get(), 900));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_TRUESCALEGREAVES.get(), 900));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.EVERDRAGONS_TRUESCALEGAUNTLETS.get(), 900));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_GRADIANT.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_PRISM.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_BEACON.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_DESPAIR.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_DESTROYER.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_ICEBREAKER.get(), 600));
        event.contents.add(new ShopScreen.ShopEntry<>(Equipments.TRUESCALE_REAVER.get(), 600));
      }
    }
  }

  @EventListener
  public void gatherEquipmentTypes(final GatherEquipmentTypesEvent event) {
    event.add(Equipments.EVERDRAGONS_HELM.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_ARMOR.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_BOOTS.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_RING.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_GREATHELM.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_PLATEARMOR.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_GREAVES.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_GAUNTLETS.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_TRUESCALEHELM.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_TRUESCALEARMOR.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_TRUESCALEGREAVES.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.EVERDRAGONS_TRUESCALEGAUNTLETS.get(), EquipmentTypes.NEUTRAL);
    event.add(Equipments.DRAGON_BLADE.get(), EquipmentTypes.LONGSWORD);
    event.add(Equipments.SCALE_EDGE.get(), EquipmentTypes.LONGSWORD);
    event.add(Equipments.TRUESCALE_GRADIANT.get(), EquipmentTypes.LONGSWORD);
    event.add(Equipments.DRAGON_SPEAR.get(), EquipmentTypes.POLEARM);
    event.add(Equipments.SCALE_POINT.get(), EquipmentTypes.POLEARM);
    event.add(Equipments.TRUESCALE_PRISM.get(), EquipmentTypes.POLEARM);
    event.add(Equipments.DRAGON_SHORTBOW.get(), EquipmentTypes.BOW);
    event.add(Equipments.SCALE_LONGBOW.get(), EquipmentTypes.BOW);
    event.add(Equipments.TRUESCALE_BEACON.get(), EquipmentTypes.BOW);
    event.add(Equipments.DRAGON_SHORTBLADE.get(), EquipmentTypes.SHORTSWORD);
    event.add(Equipments.SCALE_SCRAPER.get(), EquipmentTypes.SHORTSWORD);
    event.add(Equipments.TRUESCALE_DESPAIR.get(), EquipmentTypes.SHORTSWORD);
    event.add(Equipments.DRAGON_FIST.get(), EquipmentTypes.HAND);
    event.add(Equipments.SCALE_CRUSHER.get(), EquipmentTypes.HAND);
    event.add(Equipments.TRUESCALE_DESTROYER.get(), EquipmentTypes.HAND);
    event.add(Equipments.DRAGON_HAMMER.get(), EquipmentTypes.HAMMER);
    event.add(Equipments.SCALE_MAUL.get(), EquipmentTypes.HAMMER);
    event.add(Equipments.TRUESCALE_ICEBREAKER.get(), EquipmentTypes.HAMMER);
    event.add(Equipments.DRAGON_AXE.get(), EquipmentTypes.AXE);
    event.add(Equipments.SCALE_CLEAVER.get(), EquipmentTypes.AXE);
    event.add(Equipments.TRUESCALE_REAVER.get(), EquipmentTypes.AXE);
  }
}
