//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException

/**
 * MismatchOfAssetValueType
 *
 * Generated from 'MismatchOfAssetValueType' regular structure
 */
public data class MismatchOfAssetValueType(
    public val expected: AssetValueType,
    public val `actual`: AssetValueType
) {
    public companion object :
        ScaleReader<MismatchOfAssetValueType>,
        ScaleWriter<MismatchOfAssetValueType> {
        public override fun read(reader: ScaleCodecReader): MismatchOfAssetValueType = try {
            MismatchOfAssetValueType(
                AssetValueType.read(reader),
                AssetValueType.read(reader),
            )
        } catch (ex: Exception) {
            throw wrapException(ex)
        }

        public override fun write(writer: ScaleCodecWriter, instance: MismatchOfAssetValueType) = try {
            AssetValueType.write(writer, instance.expected)
            AssetValueType.write(writer, instance.`actual`)
        } catch (ex: Exception) {
            throw wrapException(ex)
        }
    }
}
