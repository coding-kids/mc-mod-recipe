package codingkids.mc.ckrecipe;

import codingkids.mc.ckrecipe.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class RecipeMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Item myItem;
    public static Item myDust;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        myItem = new Item()
                .setRegistryName("my_item")
                .setTranslationKey("ckrecipe.my_item")
                .setCreativeTab(CreativeTabs.MISC);
        myDust = new Item()
                .setRegistryName("my_dust")
                .setTranslationKey("ckrecipe.my_dust")
                .setCreativeTab(CreativeTabs.MISC);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
