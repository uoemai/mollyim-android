package org.thoughtcrime.securesms.util

import org.thoughtcrime.securesms.BuildConfig

object Environment {
  const val IS_STAGING: Boolean = BuildConfig.BUILD_ENVIRONMENT_TYPE == "Staging"
  const val IS_DEV: Boolean = BuildConfig.BUILD_ENVIRONMENT_TYPE == "Dev" || BuildConfig.BUILD_VARIANT_TYPE == "Instrumentation"
}
