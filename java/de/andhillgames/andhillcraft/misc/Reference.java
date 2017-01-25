package de.andhillgames.andhillcraft.misc;

public class Reference {
	public static final String MODID = "andhillcraft";
	public static final String NAME = "AndHillCraft";
	public static final String VERSION = "0.3A";
	public static final String MCVERSIONS = "[1.9], [1.9.1], [1.9.2] [1.9.3], [1.9.4], [1.10], [1.10.1], [1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "de.andhillgames.andhillcraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "de,andhillgames.andhillcraft.proxy.Serverproxy";

	public static enum AndHillCraftItems {
		CONVERSIONBALL("conversionBall", "ItemConversionBall"),
		CONVERSIONWAND("conversionWand", "ItemConversionWand"),
		BLOODDIAMOND("bloodDiamond", "ItemBloodDiamond"),
		BLOODDIAMONDDUST("bloodDiamondDust", "ItemBloodDiamondDust"),
		BLOODDIAMONDINGOT("bloodDiamondIngot", "ItemBloodDiamondIngot"),
		FLINTDUST("flintDust", "ItemFlintDust"),
		GRAVELDUST("gravelDust", "ItemGravelDust"),
		PORTABLECRAFTINGTABLE("portableCraftingTable", "ItemPortableCraftingTable"),
		REDCOAL("redCoal", "ItemRedCoal"),
		COPPERINGOT("copperIngot", "ItemCopperIngot"),
		TININGOT("tinIngot", "ItemTinIngot"),
		SILVERINGOT("silverIngot", "ItemSilverIngot"),
		LEADINGOT("leadIngot", "ItemLeadIngot"),
		ALUMINIUMINGOT("aluminiumIngot", "ItemAluminiumIngot"),
		FERROUSINGOT("ferrousIngot", "ItemFerrousIngot"),
		URANIUMINGOT("uraniumIngot", "ItemUraniumIngot"),
		SALT("salt", "ItemSalt");
		
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
		XPSTONE("xpStone", "BlockXPStone"),
		XPNETHERRACK("xpNetherRack", "BlockXPNetherRack"),
		BLOODDIAMONDORE("bloodDiamondOre", "BlockBloodDiamondOre"),
		BLOODDIAMONDBLOCK("bloodDiamondBlock", "BlockBloodDiamondBlock"),
		NETHERBLOODDIAMONDORE("netherBloodDiamondOre", "BlockNetherBloodDiamondOre"),
		NETHERREDCOAL("netherRedCoalOre", "BlockNetherRedCoalOre"),
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
		NETHEREMERALDORE("netherEmeraldOre", "BlockNetherEmeraldOre");
		
		
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