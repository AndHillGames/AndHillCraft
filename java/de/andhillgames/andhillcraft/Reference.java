package de.andhillgames.andhillcraft;

public class Reference {
	public static final String MODID = "andhillcraft";
	public static final String NAME = "AndHillCraft";
	public static final String VERSION = "0.1A";
	public static final String MCVERSIONS = "[1.10]";
	
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
		REDCOAL("redCoal", "ItemRedCoal");
		
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
		XPNETHERRACK("xpNetherRack", "BlockXPNetherRack");
		
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