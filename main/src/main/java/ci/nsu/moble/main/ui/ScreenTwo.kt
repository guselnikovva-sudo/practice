package ci.nsu.moble.main.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenTwo(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit
) {
    var deposit by remember { mutableStateOf("") }
    var month by remember { mutableStateOf("") }
    var depositError by remember { mutableStateOf(false) }
    var monthError by remember { mutableStateOf(false) }

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
        OutlinedTextField(
            value = deposit,
            onValueChange = {
                deposit = it
                depositError = false
            },
            label = { Text("Стартовый взнос")},
            isError = depositError,
            supportingText = {
                if (depositError) Text("Обязательное поле")
            },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = month,
            onValueChange = {
                month = it
                monthError = false
            },
            label = { Text("Срок вклада")},
            isError = monthError,
            supportingText = {
                if (monthError) Text("Обязательное поле")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onBackClick) {
            Text("Назад")
        }
    }
}