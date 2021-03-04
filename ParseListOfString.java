
private List<String> convertToList(String ListOfString) {

		Function<String, String> trimArrayBrackets = (x) -> (x.substring(1, x.length() - 2));

		Function<String, String[]> splitByComma = (x) -> x.split(",");

		return Arrays.asList(trimArrayBrackets
				.andThen(splitByComma)
				.apply(ListOfString));
}
