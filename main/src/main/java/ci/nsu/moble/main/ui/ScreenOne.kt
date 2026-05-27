package ci.nsu.moble.main.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenOne(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Основные параметры",
            fontSize = 30.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp)
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onBackClick) {
            Text("Назад")
        }
    }
}