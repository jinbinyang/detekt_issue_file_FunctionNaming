@Composable
fun FooButton(text: String, onClick: () -> Unit) {
    Button(onClick = onClick) {
         Text(text)
    }
}
