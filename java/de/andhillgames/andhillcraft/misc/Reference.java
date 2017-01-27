package de.andhillgames.andhillcraft.misc;

public class Reference {
	public static final String MODID = "andhillcraft";
	public static final String NAME = "AndHillCraft";
	public static final String VERSION = "0.4A";
	public static final String MCVERSIONS = "[1.9], [1.9.1], [1.9.2] [1.9.3], [1.9.4], [1.10], [1.10.1], [1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "de.andhillgames.andhillcraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "de,andhillgames.andhillcraft.proxy.Serverproxy";

	public static enum AndHillCraftItems {
		// Dummy
		AHGICON("ahgIcon", "ItemAhgIcon"),
		
		// Tools
		CONVERSIONBALL("conversionBall", "ItemConversionBall"),
		CONVERSIONWAND("conversionWand", "ItemConversionWand"),
		PORTABLECRAFTINGTABLE("portableCraftingTable", "ItemPortableCraftingTable"),
		
		// Materials
		BLOODDIAMOND("bloodDiamond", "ItemBloodDiamond"),
		REDCOAL("redCoal", "ItemRedCoal"),
		BLOODDIAMONDINGOT("bloodDiamondIngot", "ItemBloodDiamondIngot"),
		COPPERINGOT("copperIngot", "ItemCopperIngot"),
		TININGOT("tinIngot", "ItemTinIngot"),
		SILVERINGOT("silverIngot", "ItemSilverIngot"),
		LEADINGOT("leadIngot", "ItemLeadIngot"),
		ALUMINIUMINGOT("aluminiumIngot", "ItemAluminiumIngot"),
		FERROUSINGOT("ferrousIngot", "ItemFerrousIngot"),
		URANIUMINGOT("uraniumIngot", "ItemUraniumIngot"),
		BLOODDIAMONDDUST("bloodDiamondDust", "ItemBloodDiamondDust"),
		FLINTDUST("flintDust", "ItemFlintDust"),
		GRAVELDUST("gravelDust", "ItemGravelDust"),
		SALT("salt", "ItemSalt"),
		
		// Miscellaneous
		SMALLBACKPACK("smallBackPack", "ItemSmallBackPack"),
		MEDIUMBACKPACK("mediumBackPack", "ItemMediumBackPack"),
		BIGBACKPACK("bigBackPack", "ItemBigBackPack");
		
		
		private String unlocalizedName;
		private String registryName;
		
		AndHillCraftItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum AndHillCraftBlocks {
		// Building Blocks
		XPSTONE("xpStone", "BlockXPStone"),
		XPNETHERRACK("xpNetherRack", "BlockXPNetherRack"),
		BLOODDIAMONDBLOCK("bloodDiamondBlock", "BlockBloodDiamondBlock"),
		
		// Ores
		NETHERBLOODDIAMONDORE("netherBloodDiamondOre", "BlockNetherBloodDiamondOre"),
		NETHERREDCOAL("netherRedCoalOre", "BlockNetherRedCoalOre"),
		BLOODDIAMONDORE("bloodDiamondOre", "BlockBloodDiamondOre"),
		REDCOALORE("redCoalOre", "BlockRedCoalOre"),
		COPPERORE("copperOre", "BlockCopperOre"),
		TINORE("tinOre", "BlockTinOre"),
		SILVERORE("silverOre", "BlockSilverOre"),
		LEADORE("leadOre", "BlockLeadOre"),
		ALUMINIUMORE("aluminiumOre", "BlockAluminiumOre"),
		FERROUSORE("ferrousOre", "BlockFerrousOre"),
		URANIUMORE("uraniumOre", "BlockUraniumOre"),
		SALTORE("saltOre", "BlockSaltOre"),
		NETHERCOPPERORE("netherCopperOre", "BlockNetherCopperOre"),
		NETHERTINORE("netherTinOre", "BlockNetherTinOre"),
		NETHERSILVERORE("netherSilverOre", "BlockNetherSilverOre"),
		NETHERLEADORE("netherLeadOre", "BlockNetherLeadOre"),
		NETHERALUMINIUMORE("netherAluminiumOre", "BlockNetherAluminiumOre"),
		NETHERFERROUSORE("netherFerrousOre", "BlockNetherFerrousOre"),
		NETHERURANIUMORE("netherUraniumOre", "BlockNetherUraniumOre"),
		NETHERSALTORE("netherSaltOre", "BlockNetherSaltOre"),
		NETHERIRONORE("netherIronOre", "BlockNetherIronOre"),
		NETHERCOALORE("netherCoalOre", "BlockNetherCoalOre"),
		NETHERGOLDORE("netherGoldOre", "BlockNetherGoldOre"),
		NETHERDIAMONDORE("netherDiamondOre", "BlockNetherDiamondOre"),
		NETHERLAPISLAZULIORE("netherLapisLazuliOre", "BlockNetherLapisLazuliOre"),
		NETHERREDSTONEORE("netherRedStoneOre", "BlockNetherRedStoneOre"),
		NETHEREMERALDORE("netherEmeraldOre", "BlockNetherEmeraldOre"),
		
		// Machines
		ADVANCEDCRAFTINGTABLE("advancedCraftingTable", "BlockAdvancedCraftingTable");
		
		private String unlocalizedName;
		private String registryName;
		
		AndHillCraftBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}